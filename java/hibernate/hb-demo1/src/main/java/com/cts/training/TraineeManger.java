package com.cts.training;

import org.hibernate.Session;

import java.util.List;

public class TraineeManger {

    public void createTrainee(Trainee t) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.getTransaction().begin();
            session.save(t);
            session.getTransaction().commit();
            session.close();
        }
    }

    public Trainee findById(Integer id) {
        Trainee t = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.getTransaction().begin();
            t = session.get(Trainee.class, id);
            session.getTransaction().commit();
            session.close();
        }
        return t;
    }

    public List<Trainee> findAll() {
        List<Trainee> trainees = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            trainees =  session.createQuery("from Trainee t", Trainee.class).list();
        }
        return  trainees;
    }

    public void deletById(Integer id) {
        Trainee t = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.getTransaction().begin();
            t = session.load(Trainee.class, id);
            session.delete(t);
            session.getTransaction().commit();
            session.close();
        }
    }
}
