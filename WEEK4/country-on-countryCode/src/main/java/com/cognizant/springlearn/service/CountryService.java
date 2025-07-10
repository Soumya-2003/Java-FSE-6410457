package com.cognizant.springlearn.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.Country;

@Service
public class CountryService {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(CountryService.class);
    
    private static final List<String> COUNTRY_IDS = Arrays.asList("us", "germany", "india", "japan", "uk");
    
    public Country getCountry(String code) {
        LOGGER.debug("Searching for country with code: {}", code);
        
        if (code == null || code.trim().isEmpty()) {
            LOGGER.warn("Country code is null or empty");
            return null;
        }
        
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("countries.xml")) {
            
            Optional<Country> foundCountry = COUNTRY_IDS.stream()
                    .map(id -> {
                        try {
                            return (Country) context.getBean(id, Country.class);
                        } catch (Exception e) {
                            LOGGER.warn("Could not retrieve bean with ID: {}", id);
                            return null;
                        }
                    })
                    .filter(country -> country != null && 
                            country.getCode() != null && 
                            country.getCode().equalsIgnoreCase(code.trim()))
                    .findFirst();
            
            if (foundCountry.isPresent()) {
                Country country = foundCountry.get();
                LOGGER.info("Found country: {} for code: {}", country.getName(), code);
                return country;
            } else {
                LOGGER.warn("No country found for code: {}", code);
                return null;
            }
            
        } catch (Exception e) {
            LOGGER.error("Error loading countries from XML configuration: {}", e.getMessage(), e);
            return null;
        }
    }
}
