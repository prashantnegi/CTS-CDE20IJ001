package com.cts.training.dao;

import com.cts.training.model.Book;
import com.cts.training.model.Topic;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface BookDAO {

    List<Book> getSortedComputingBooksByTitle();

    Map<Topic, List<Book>> booksByTopic();

    Map<Topic, Long> bookCountByTopic();

    Optional<Topic> mostPopularTopic();

    List<Book> getLibrary();

    List<String> getBookTitles();
}
