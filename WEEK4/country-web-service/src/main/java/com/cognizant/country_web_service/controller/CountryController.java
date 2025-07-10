package com.cognizant.country_web_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.country_web_service.model.Country;

@RestController
public class CountryController {
    @Autowired
    private Country country;

    @RequestMapping("/country")
    public Country getCountry() {
        return country;
    }
}
