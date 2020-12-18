package com.cts.training.dao;

import com.cts.training.model.Book;
import com.cts.training.model.Topic;
import com.cts.training.model.Utils;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BookDAOImpl implements  BookDAO {

    public static Path DEFAULT_PATH;

    static {
        try {
            DEFAULT_PATH = Paths.get(ClassLoader.getSystemResource("books.csv").toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    private List<Book> library;
    private final Utils utils = new Utils();

    @Override
    public List<Book> getSortedComputingBooksByTitle() {
        return library.stream()
                .filter(b -> b.getTopic() == Topic.COMPUTING)
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());
    }

    @Override
    public Map<Topic, List<Book>> booksByTopic() {
        return library.stream()
                .collect(Collectors.groupingBy(Book::getTopic));
    }

    @Override
    public Map<Topic, Long> bookCountByTopic() {
         return library.stream()
                .collect(Collectors.groupingBy(Book::getTopic, Collectors.counting()));
    }

    @Override
    public Optional<Topic> mostPopularTopic() {
        return library.stream()
                .collect(Collectors.groupingBy(Book::getTopic, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }


    @Override
    public List<Book> getLibrary() {
        return Collections.unmodifiableList(library);
    }

    @Override
    public List<String> getBookTitles() {
        return library.stream()
                .map(Book::getTitle)
                .collect(Collectors.toList());
    }

    private void parseLibraryFrom(Path path) {
        this.library = utils.parseLibraryFrom(path);
    }

}
