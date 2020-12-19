package com.cts.training.repo;

import com.cts.training.entity.Book;
import com.cts.training.util.HibernateUtil;
import org.hibernate.Session;

import javax.validation.ConstraintViolation;
import java.util.List;
import java.util.Set;

public class BookRepositoryImpl implements BookRepository {
    @Override
    public void create(Book b) {

        Set<ConstraintViolation<Book>> validate = HibernateUtil.validate(b);

        if (!validate.isEmpty()) {
            validate.forEach(e -> System.err.println("ERROR: " + e.getMessage()));
            throw new RuntimeException("Cannot persist data due to validation errors.");
        }
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.save(b);
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public Book findByTtile(String title) {
        return null;
    }

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public void update(Book b) {

    }

    @Override
    public void delete(Book b) {

    }
}
