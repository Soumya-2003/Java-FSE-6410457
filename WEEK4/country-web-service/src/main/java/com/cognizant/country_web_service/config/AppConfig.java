package com.cognizant.country_web_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cognizant.country_web_service.model.Country;

@Configuration
public class AppConfig {
    @Bean
    public Country countryIndia() {
        return new Country("IN", "India");
    }
}
