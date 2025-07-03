package com.cognizant.orm_learn.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country {
    @Id
    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "country_name")
    private String countryName; 

    public String getCode(){
        return countryCode;
    }

    public void setCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getName() {
        return countryName;
    }   

    public void setName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "Country [countryCode=" + countryCode + ", countryName=" + countryName + "]";
    }
}
