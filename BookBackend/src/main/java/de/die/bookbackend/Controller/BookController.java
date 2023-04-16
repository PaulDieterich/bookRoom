package de.die.bookbackend.Controller;


import de.die.openAPI.api.BooksApi;
import de.die.openAPI.model.BookDto;
import de.die.openAPI.model.CreateBookDto;
import de.die.openAPI.model.UpdateUserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController implements BooksApi {

    @Override
    public ResponseEntity<List<BookDto>> getAll() {
        return BooksApi.super.getAll();
    }

    @Override
    public ResponseEntity<BookDto> getBooksById(Long bookId) {
        return BooksApi.super.getBooksById(bookId);
    }

    @Override
    public ResponseEntity<BookDto> findByAuthor(Long authorId) {
        return BooksApi.super.findByAuthor(authorId);
    }

    @Override
    public ResponseEntity<BookDto> findByLanguage(Long languageId) {
        return BooksApi.super.findByLanguage(languageId);
    }
    @Override
    public ResponseEntity<BookDto> updateBook(Long bookId, UpdateUserDto updateUserDto) {
        return BooksApi.super.updateBook(bookId, updateUserDto);
    }

    @Override
    public ResponseEntity<BookDto> createBook(CreateBookDto createBookDto) {
        return BooksApi.super.createBook(createBookDto);
    }

    @Override
    public ResponseEntity<Void> deleteBook(Long bookId) {
        return BooksApi.super.deleteBook(bookId);
    }
}
