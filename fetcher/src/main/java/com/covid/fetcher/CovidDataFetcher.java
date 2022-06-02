package com.covid.fetcher;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * @author Korben on 2022/6/1
 */
@Component
public class CovidDataFetcher {

    public static final String BAIDU_COVID_DATA_URL = "https://voice.baidu.com/act/newpneumonia/newpneumonia";

    public static void main(String[] args) throws Exception {
        List<CovidFetchData> covidData = new CovidDataFetcher().fetchCovidData();
        System.out.println(JSON.toJSONString(covidData));
    }

    public List<CovidFetchData> fetchCovidData() throws Exception {
        String htmlData = fetchDataFromRemoteUrl();
        String jsonData = parseCovidData(htmlData);
        return toCovidObj(jsonData);
    }

    private List<CovidFetchData> toCovidObj(String covidData) {
        JSONObject jsonObject = JSON.parseObject(covidData);
        JSONObject component = (JSONObject) jsonObject.getJSONArray("component").get(0);
        JSONArray caseList = component.getJSONArray("caseList");
        return caseList.toJavaList(CovidFetchData.class);
    }

    private String parseCovidData(String covidHtml) {
        int startIndex = covidHtml.indexOf("id=\"captain-config\">");
        String data = covidHtml.substring(startIndex + "id=\"captain-config\">".length());
        int endIndex = data.indexOf("</script>");
        return data.substring(0, endIndex);
    }

    private String fetchDataFromRemoteUrl() throws Exception {
        return HttpUtils.get(BAIDU_COVID_DATA_URL);
    }
}
