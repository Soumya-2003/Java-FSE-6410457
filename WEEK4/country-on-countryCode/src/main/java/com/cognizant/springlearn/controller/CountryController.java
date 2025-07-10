package com.cognizant.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.service.CountryService;


@RestController
public class CountryController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);
    
    @Autowired
    private CountryService countryService;
    
    @GetMapping("/countries/{code}")
    public ResponseEntity<Country> getCountry(@PathVariable String code) {
        LOGGER.info("Received request for country with code: {}", code);
        
        Country country = countryService.getCountry(code);
        
        if (country != null) {
            LOGGER.info("Successfully found country: {} for code: {}", country.getName(), code);
            return ResponseEntity.ok(country);
        } else {
            LOGGER.warn("Country not found for code: {}", code);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
