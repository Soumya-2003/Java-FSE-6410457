package com.cognizant.jpa_demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.jpa_demo.model.Employee;

import jakarta.transaction.Transactional;


@Component
public class EmployeeHibernateDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    @SuppressWarnings("ConvertToTryWithResources")
    public void saveEmployee(Employee employee) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(employee);
        tx.commit();
        session.close();
    }
}
