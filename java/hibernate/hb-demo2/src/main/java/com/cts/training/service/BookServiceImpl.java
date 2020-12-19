package com.cts.training.service;

import com.cts.training.entity.Book;
import com.cts.training.repo.BookRepository;
import lombok.Setter;

import java.util.List;

@Setter
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    @Override
    public void create(Book b) {
        bookRepository.create(b);
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
