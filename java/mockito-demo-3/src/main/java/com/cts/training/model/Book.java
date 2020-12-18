package com.cts.training.model;

import lombok.*;

import java.time.Year;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Book {

    private final String title;
    private final int pageCount;
    private final Topic topic;
    private final Year publicationDate;
    private final List<String> authors;

    public Book(String title, int pageCount, Topic topic, Year publicationDate, String... authors) {
        this.title = title;
        this.pageCount = pageCount;
        this.topic = topic;
        this.publicationDate = publicationDate;
        this.authors = Arrays.asList(authors);
    }
}
