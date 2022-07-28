package com.covid.fetcher;

import java.util.List;
import lombok.Data;

/**
 * @author Korben on 2022/7/28
 */
@Data
public class ReadhubDailyNewsData {
    private String title;
    private String siteNameDisplay;
    private String summary;
    private String newsCreatedAt;
    private List<ReadhubNewsAgg> newsAggList;

}
