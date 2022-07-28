package com.covid.component.service;

import com.covid.component.domain.ReadhubDailyNews;
import com.covid.component.domain.ReadhubDailyNewsAgg;
import com.covid.component.mapper.ReadhubDailyNewsAggMapper;
import com.covid.component.mapper.ReadhubDailyNewsMapper;
import com.covid.fetcher.ReadhubDailyNewsData;
import com.covid.fetcher.ReadhubFetcher;
import com.covid.fetcher.ReadhubNewsAgg;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Korben on 2022/7/28
 */
@Service
public class ReadhubService {

    @Autowired
    private ReadhubFetcher readhubFetcher;

    @Autowired
    private ReadhubDailyNewsMapper readhubDailyNewsMapper;

    @Autowired
    private ReadhubDailyNewsAggMapper readhubDailyNewsAggMapper;

    public void fetchReadhubNewsAndSaveToDb() throws Exception {
        List<ReadhubDailyNewsData> readhubDailyNewsDataList = readhubFetcher.fetchReadhubDailyNews();

        LocalDateTime now = LocalDateTime.now();
        readhubDailyNewsDataList.forEach(data -> {
            ReadhubDailyNews dailyNews = new ReadhubDailyNews();
            dailyNews.setTitle(data.getTitle());
            dailyNews.setSummary(data.getSummary());
            dailyNews.setSiteName(data.getSiteNameDisplay());
            dailyNews.setNewsCreatedAt(data.getNewsCreatedAt());
            dailyNews.setNewsDate(now.toLocalDate());
            dailyNews.setCreatedAt(now);
            readhubDailyNewsMapper.insert(dailyNews);

            List<ReadhubNewsAgg> newsAggList = data.getNewsAggList();
            newsAggList.forEach(agg -> {
                ReadhubDailyNewsAgg newsAgg = new ReadhubDailyNewsAgg();
                newsAgg.setNewsId(dailyNews.getId());
                newsAgg.setTitle(agg.getTitle());
                newsAgg.setSiteName(agg.getSiteNameDisplay());
                newsAgg.setUrl(agg.getUrl());
                newsAgg.setCreatedAt(now);
                readhubDailyNewsAggMapper.insert(newsAgg);
            });
        });
    }
}
