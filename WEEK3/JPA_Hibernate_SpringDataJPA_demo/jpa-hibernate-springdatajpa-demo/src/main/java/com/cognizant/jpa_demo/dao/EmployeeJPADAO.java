package com.cognizant.jpa_demo.dao;

import org.springframework.stereotype.Component;

import com.cognizant.jpa_demo.model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Component
public class EmployeeJPADAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void saveEmployee(Employee employee) {
        entityManager.persist(employee);
    }
}
