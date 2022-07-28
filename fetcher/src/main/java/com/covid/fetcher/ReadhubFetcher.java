package com.covid.fetcher;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.jsoup.Jsoup;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Component;

/**
 * Readhub 每日早报
 *
 * @author Korben on 2022/7/28
 */
@Component
public class ReadhubFetcher {

    private static final String READHUB_DAILY_NEWS_URL = "https://readhub.cn/daily";
    private static final String READHUB_DAILY_NEWS_DETAIL_URL ="https://readhub.cn/_next/data/%s/topic/%s.json";

    public static void main(String[] args) throws Exception {
        List<ReadhubDailyNewsData> dailyNews = new ReadhubFetcher()
                .fetchReadhubDailyNews();

        System.out.println(JSON.toJSONString(dailyNews));
    }

    public List<ReadhubDailyNewsData> fetchReadhubDailyNews() throws Exception {
        String dailyHtmlContent = fetchDailyHtml(READHUB_DAILY_NEWS_URL);

        Document doc = Jsoup.parse(dailyHtmlContent);
        Element nextDataElement = doc.getElementById("__NEXT_DATA__");
        String nextData = nextDataElement.childNodes().get(0).toString();
        JSONObject nextDataJson = JSON.parseObject(nextData);
        String buildId = nextDataJson.get("buildId").toString();

        JSONArray newsArray = nextDataJson.getJSONObject("props").getJSONObject("pageProps")
                .getJSONArray("daily");

        List<ReadhubDailyNewsData> result = new ArrayList<>(newsArray.size());
        for (int i = 0; i < newsArray.size(); i++) {
            JSONObject newsData = newsArray.getJSONObject(i);

            String uid = newsData.getString("uid");
            String newsDetailUrl = getNewsDetailUrl(buildId, uid);

            ReadhubDailyNewsData newsDetailInfo = fetchNewsDetailInfo(newsDetailUrl);
            result.add(newsDetailInfo);
        }
        return result;
    }

    private String fetchDailyHtml(String readhubDailyNewsUrl) throws Exception {
        return HttpUtils.get(readhubDailyNewsUrl);
    }
    
    private ReadhubDailyNewsData fetchNewsDetailInfo(String url) throws Exception{
        String newsDataJson = HttpUtils.get(url);
        JSONObject newsDataJsonObj = JSON.parseObject(newsDataJson)
                .getJSONObject("pageProps")
                .getJSONObject("topic");

        ReadhubDailyNewsData newsData = new ReadhubDailyNewsData();
        newsData.setTitle(newsDataJsonObj.getString("title"));
        newsData.setSummary(newsDataJsonObj.getString("summary"));
        newsData.setNewsCreatedAt(newsDataJsonObj.getString("createdAt"));
        newsData.setSiteNameDisplay(newsDataJsonObj.getString("CNBeta"));

        JSONArray newsAggListArr = newsDataJsonObj.getJSONArray("newsAggList");
        List<ReadhubNewsAgg> aggs = new ArrayList<>(newsAggListArr.size());
        for (int i = 0; i < newsAggListArr.size(); i++) {
            JSONObject listArrJsonObject = newsAggListArr.getJSONObject(i);
            aggs.add(listArrJsonObject.toJavaObject(ReadhubNewsAgg.class));
        }

        newsData.setNewsAggList(aggs);
        return newsData;
    }

    private String getNewsDetailUrl(String buildId, String uid) {
        return String.format(READHUB_DAILY_NEWS_DETAIL_URL, buildId, uid);
    }
}
