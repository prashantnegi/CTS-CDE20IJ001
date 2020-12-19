package com.cts.training.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.ISBN;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(generator = "customeBookIdGenerator")
    @GenericGenerator(name = "customeBookIdGenerator", strategy = "uuid2")
    private String id;

    @ISBN(message = "ISBN provided is not valid")
    private String isbn;

    @NotNull(message = "Publish date of the book cannot be blank.")
    private LocalDate publishedDate;

    @NotBlank(message = "Title of the book cannot be blank.")
    private String title;

    @NotBlank(message = "Author of the book cannot be blank.")
    private String author;
}
