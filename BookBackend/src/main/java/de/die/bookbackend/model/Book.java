package de.die.bookbackend.model;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.*;

import java.beans.ConstructorProperties;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "books")
@Setter
@Getter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor

public class Book extends Media{


    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "isbn", nullable = false)
    private String isbn;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "publisher", nullable = false)
    private String publisher;

    @Column(name = "releaseDate", nullable = false)
    private Instant releaseDate;

    @Column(name = "language", nullable = false)
    private String language;

    @Column(name = "author", nullable = false)
    @ManyToMany
    @JoinTable(name = "author_book",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private List<Author> author = new ArrayList<>();



}
