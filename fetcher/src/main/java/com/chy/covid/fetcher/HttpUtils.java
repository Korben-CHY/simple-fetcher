package com.chy.covid.fetcher;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * @author Korben on 2022/6/1
 */
public class HttpUtils {

    public static String get(String url) throws Exception {
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse httpResponse = null;
        try {
            httpClient = HttpClients.createDefault();
            httpResponse = httpClient.execute(new HttpGet(url));
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode == HttpStatus.SC_OK) {
                HttpEntity entity = httpResponse.getEntity();
                return EntityUtils.toString(entity);
            } else {
                throw new RuntimeException("请求错误：" + statusCode);
            }
        } finally {
            if (httpClient != null) {
                httpClient.close();
            }
            if (httpResponse != null) {
                httpClient.close();
            }
        }
    }
}
