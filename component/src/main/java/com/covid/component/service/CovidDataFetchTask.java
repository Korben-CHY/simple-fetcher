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
public class CovidDataFetchTask {

    @Autowired
    private CovidService covidService;

    @SneakyThrows
    @Scheduled(cron = "0 0 8-9 * * *")
    public void fetchCovidDataAndSaveToDb() {
        covidService.fetchCovidDataAndSaveToDb();
    }
}
