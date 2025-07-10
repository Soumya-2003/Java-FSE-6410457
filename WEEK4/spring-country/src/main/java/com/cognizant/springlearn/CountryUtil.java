package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountryUtil {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(CountryUtil.class);
    
    public static void displayAllCountries() {
        LOGGER.debug("Starting displayAllCountries() method");
        
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("countries.xml")) {
            
            String[] countryIds = {"us", "germany", "india", "japan"};
            
            for (String countryId : countryIds) {
                Country country = (Country) context.getBean(countryId, Country.class);
                LOGGER.info("Country [{}]: {}", countryId, country.toString());
            }
            
        } catch (Exception e) {
            LOGGER.error("Error loading countries: {}", e.getMessage(), e);
        }
        
        LOGGER.debug("Completed displayAllCountries() method");
    }
    
    public static void main(String[] args) {
        LOGGER.info("Starting Country Utility Application");
        displayAllCountries();
        LOGGER.info("Country Utility Application completed");
    }
}
