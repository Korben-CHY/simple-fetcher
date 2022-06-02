package com.covid.component.service;

import com.covid.component.domain.CovidData;
import com.covid.component.domain.CovidDataExample;
import com.covid.component.mapper.CovidDataMapper;
import com.covid.fetcher.CovidDataFetcher;
import com.covid.fetcher.CovidFetchData;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Korben on 2022/6/2
 */
@Service
public class CovidService {

    @Autowired
    private CovidDataMapper covidDataMapper;

    @Autowired
    private CovidDataFetcher covidDataFetcher;

    public void saveCovidData(CovidFetchData covidFetchData) {
        CovidData covidData = getByAreaAndUpdateTime(covidFetchData.getArea(),
                covidFetchData.getUpdateTime());
        if (covidData != null) {
            toCovidData(covidData, covidFetchData);
            covidDataMapper.updateByPrimaryKey(covidData);
        } else {
            covidData = new CovidData();
            toCovidData(covidData, covidFetchData);
            covidData.setCreateTime(LocalDateTime.now());
            covidDataMapper.insert(covidData);
        }
    }

    public void fetchCovidDataAndSaveToDb() throws Exception {
        List<CovidFetchData> covidFetchData = covidDataFetcher.fetchCovidData();
        covidFetchData.forEach(this::saveCovidData);
    }

    private CovidData getByAreaAndUpdateTime(String area, long updateTime) {
        CovidDataExample dataExample = new CovidDataExample();
        dataExample.createCriteria()
                .andAreaEqualTo(area)
                .andUpdateTimeEqualTo(updateTime);
        List<CovidData> covidData = covidDataMapper.selectByExample(dataExample);
        if (covidData.isEmpty()) {
            return null;
        }

        // 唯一key
        return covidData.get(0);
    }

    private void toCovidData(CovidData covidData, CovidFetchData covidFetchData) {
        BeanUtils.copyProperties(covidFetchData, covidData);
    }
}
