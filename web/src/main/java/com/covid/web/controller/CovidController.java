package com.covid.web.controller;

import com.covid.component.service.CovidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Korben on 2022/6/2
 */
@RestController
@RequestMapping("/rest/covid")
public class CovidController {

    @Autowired
    private CovidService covidService;

    @GetMapping("refresh")
    public String refreshCovidData() throws Exception {
        covidService.fetchCovidDataAndSaveToDb();

        return "success";
    }
}
