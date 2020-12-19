package com.cts.training.service;

import com.cts.training.entity.Book;

import java.util.List;

public interface BookService {

    void create(Book b);

    Book findByTtile(String title);

    List<Book> findAll();

    void update(Book b);

    void delete(Book b);
}
