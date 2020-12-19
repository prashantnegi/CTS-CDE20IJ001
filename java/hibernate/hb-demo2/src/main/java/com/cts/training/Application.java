package com.cts.training;

import com.cts.training.entity.Book;
import com.cts.training.repo.BookRepository;
import com.cts.training.repo.BookRepositoryImpl;
import com.cts.training.service.BookService;
import com.cts.training.service.BookServiceImpl;
import com.cts.training.util.HibernateUtil;
import org.hibernate.Session;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.time.LocalDate;
import java.util.Set;

public class Application {

    public static void main(String[] args) {

        BookRepository bookRepository = new BookRepositoryImpl();

        BookServiceImpl bookService = new BookServiceImpl();
        bookService.setBookRepository(bookRepository);

        Book validBook = new Book();
        validBook.setTitle("Halo Silent Storm");
        validBook.setAuthor("Troy Denning");
        validBook.setPublishedDate(LocalDate.of(2018, 10,10));
        validBook.setIsbn("9781501138386");

        Book invalidBook = new Book();
        invalidBook.setTitle("Some tile");
        invalidBook.setAuthor("");
        invalidBook.setPublishedDate(LocalDate.of(2018, 10,10));
        invalidBook.setIsbn("1234HJK");

        try{
            bookService.create(invalidBook);
        }catch (RuntimeException ex){
            System.err.println("ERROR: " + ex.getMessage());
        }

    }
}
