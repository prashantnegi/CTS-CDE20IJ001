package com.cts.training;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        Trainee t1 = new Trainee();

        t1.setEmpId(100);
        t1.setEmpName("Arun Kumar");
        t1.setCohort("CDE20IJ001");
        t1.setEmail("arun.k");
        t1.setJoinDate(LocalDate.now());
        t1.setServiceLine("CDE");


        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            session.getTransaction().begin();
            session.save(t1);
            session.getTransaction().commit();
        }
    }
}
