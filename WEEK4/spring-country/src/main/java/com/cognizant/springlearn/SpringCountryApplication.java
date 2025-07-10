package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringCountryApplication {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringCountryApplication.class);
    
    public static void displayCountry() {
        LOGGER.debug("Starting displayCountry() method");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        
        Country country = (Country) context.getBean("country", Country.class);
        
        LOGGER.debug("Country : {}", country.toString());
        
        LOGGER.debug("Completed displayCountry() method");
    }
    
    
    public static void main(String[] args) {
        LOGGER.info("Starting Spring Country Application");
        
        try {
            displayCountry();
        } catch (Exception e) {
            LOGGER.error("Error occurred while loading country data: {}", e.getMessage(), e);
        }
        
        LOGGER.info("Spring Country Application completed");
    }
}
