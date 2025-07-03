package com.cognizant.jpa_demo.service;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cognizant.jpa_demo.model.Employee;

public class HibernateService {
private static Session session;

    public static void addEmployee(Employee employee) {
        session = new Configuration().configure().buildSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.persist(employee); // save() is deprecated in newer Hibernate
        tx.commit();
        session.close();
    }
}
