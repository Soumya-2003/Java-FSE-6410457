package com.cognizant.jpa_demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.jpa_demo.model.Employee;
import com.cognizant.jpa_demo.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

public class SpringDataService {
@Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}
