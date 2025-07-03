package com.cognizant.jpa_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.jpa_demo.model.Employee;
import com.cognizant.jpa_demo.service.HibernateService;
import com.cognizant.jpa_demo.service.SpringDataService;


@SpringBootApplication
public class App implements CommandLineRunner
{
    @Autowired
    private SpringDataService springDataService;

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) {
        // Hibernate approach
        Employee employee1 = new Employee("John", "HR");
        HibernateService.addEmployee(employee1);

        // Spring Data JPA approach
        Employee employee2 = new Employee("Soumyadeep", "IT");
        springDataService.addEmployee(employee2);
    }

}
