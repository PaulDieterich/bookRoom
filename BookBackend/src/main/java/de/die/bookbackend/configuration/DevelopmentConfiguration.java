package de.die.bookbackend.configuration;

import com.github.javafaker.Faker;
import de.die.bookbackend.Service.AuthorService;
import de.die.bookbackend.Service.BookService;
import de.die.bookbackend.model.Author;
import de.die.bookbackend.model.Book;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLInvalidAuthorizationSpecException;
import java.util.List;

@Configuration
@Slf4j
@RequiredArgsConstructor
public class DevelopmentConfiguration {

    private final BookService bookService;
    private final AuthorService authorService;
    /*@PostConstruct
    public void init() {
        final Faker faker = new Faker();

        for(int i = 0; i < 100; i++){
            final Author author = Author.builder()
                    .name(faker.name().fullName())
                    .build();

            authorService.saveAuthor(author);

            final Book book = Book.builder()
                                .title(faker.book().title())
                                .isbn(faker.code().isbn13())
                                .description(faker.book().genre())
                                .verlag(faker.book().publisher())
                                .veröffentlichung(faker.date().birthday().toString())
                                .author(List.of(author))
                                .build();

            bookService.saveBook(book);
        }

    }    */
}
