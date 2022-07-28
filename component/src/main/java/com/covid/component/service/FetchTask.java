package com.covid.component.service;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Korben on 2022/6/2
 */
@Component
@EnableScheduling
public class FetchTask {

    @Autowired
    private CovidService covidService;

    @Autowired
    private ReadhubService readhubService;

    @SneakyThrows
    @Scheduled(cron = "0 0 8-9 * * *")
    public void fetchCovidDataAndSaveToDb() {
        covidService.fetchCovidDataAndSaveToDb();
    }

    @SneakyThrows
    @Scheduled(cron = "0 0 6 * * *")
    public void fetchReadhubNewsAndSaveToDb() {
        readhubService.fetchReadhubNewsAndSaveToDb();
    }
}
