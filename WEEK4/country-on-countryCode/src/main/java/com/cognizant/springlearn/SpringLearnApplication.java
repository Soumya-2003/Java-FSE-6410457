package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void displayCountry() {
        LOGGER.debug("Starting displayCountry() method");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        
        Country country = (Country) context.getBean("country", Country.class);
        
        LOGGER.debug("Country : {}", country.toString());
        
        LOGGER.debug("Completed displayCountry() method");
    }
    
    public static void main(String[] args) {
        LOGGER.info("Starting Spring Boot Application");
        SpringApplication.run(SpringLearnApplication.class, args);
        LOGGER.info("Spring Boot Application started successfully");
    }
}
