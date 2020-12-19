package com.cts.training.util;

import com.cts.training.entity.Book;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class HibernateUtil {
    private static StandardServiceRegistry serviceRegistry;
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            serviceRegistry = new StandardServiceRegistryBuilder()
                    .configure()
                    .build();
            MetadataSources metadataSources = new MetadataSources(serviceRegistry);

            Metadata metadata = metadataSources.getMetadataBuilder().build();

            sessionFactory = ((Metadata) metadata).getSessionFactoryBuilder().build();
        }
        return  sessionFactory;
    }

    public static <T> Set<ConstraintViolation<T>> validate(T object){
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<T>> violations = validator.validate(object);
        return violations;
    }
}
