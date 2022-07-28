package com.covid.component.service;

import com.alibaba.fastjson.JSON;
import com.covid.component.domain.ReadhubDailyNews;
import com.covid.component.domain.ReadhubDailyNewsAgg;
import com.covid.component.domain.ReadhubDailyNewsExample;
import com.covid.component.mapper.ReadhubDailyNewsAggMapper;
import com.covid.component.mapper.ReadhubDailyNewsMapper;
import com.covid.fetcher.ReadhubDailyNewsData;
import com.covid.fetcher.ReadhubFetcher;
import com.covid.fetcher.ReadhubNewsAgg;
import java.time.LocalDateTime;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Korben on 2022/7/28
 */
@Service
public class ReadhubService {

    private static final Logger logger = LoggerFactory.getLogger(ReadhubService.class);

    @Autowired
    private ReadhubFetcher readhubFetcher;

    @Autowired
    private ReadhubDailyNewsMapper readhubDailyNewsMapper;

    @Autowired
    private ReadhubDailyNewsAggMapper readhubDailyNewsAggMapper;

    public void fetchReadhubNewsAndSaveToDb() throws Exception {
        LocalDateTime now = LocalDateTime.now();
        if (isNewsFetched(now)) {
            return;
        }

        List<ReadhubDailyNewsData> readhubDailyNewsDataList = readhubFetcher.fetchReadhubDailyNews();
        logger.info("#fetchReadhubNewsAndSaveToDb# {}", JSON.toJSONString(readhubDailyNewsDataList, true));

        saveAllNewsToDb(now, readhubDailyNewsDataList);
    }

    private void saveAllNewsToDb(LocalDateTime now, List<ReadhubDailyNewsData> readhubDailyNewsDataList) {
        readhubDailyNewsDataList.forEach(data -> {
            ReadhubDailyNews dailyNews = saveDailyNews(now, data);

            List<ReadhubNewsAgg> newsAggList = data.getNewsAggList();
            newsAggList.forEach(agg -> {
                saveNewsAgg(now, dailyNews, agg);
            });
        });
    }

    private void saveNewsAgg(LocalDateTime now, ReadhubDailyNews dailyNews, ReadhubNewsAgg agg) {
        ReadhubDailyNewsAgg newsAgg = new ReadhubDailyNewsAgg();
        newsAgg.setNewsId(dailyNews.getId());
        newsAgg.setTitle(agg.getTitle());
        newsAgg.setSiteName(agg.getSiteNameDisplay());
        newsAgg.setUrl(agg.getUrl());
        newsAgg.setCreatedAt(now);
        readhubDailyNewsAggMapper.insert(newsAgg);
    }

    private ReadhubDailyNews saveDailyNews(LocalDateTime now, ReadhubDailyNewsData data) {
        ReadhubDailyNews dailyNews = new ReadhubDailyNews();
        dailyNews.setTitle(data.getTitle());
        dailyNews.setSummary(data.getSummary());
        dailyNews.setSiteName(data.getSiteNameDisplay());
        dailyNews.setNewsCreatedAt(data.getNewsCreatedAt());
        dailyNews.setNewsDate(now.toLocalDate());
        dailyNews.setCreatedAt(now);
        readhubDailyNewsMapper.insert(dailyNews);
        return dailyNews;
    }

    private boolean isNewsFetched(LocalDateTime now) {
        ReadhubDailyNewsExample readhubDailyNewsExample = new ReadhubDailyNewsExample();
        readhubDailyNewsExample.createCriteria()
                .andNewsDateEqualTo(now.toLocalDate());
        long dailyNewsCount = readhubDailyNewsMapper.countByExample(readhubDailyNewsExample);
        if (dailyNewsCount > 0) {
            return true;
        }
        return false;
    }
}
