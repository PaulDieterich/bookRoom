package de.die.bookbackend.Service;


import de.die.bookbackend.Repository.BookRepository;
import de.die.bookbackend.model.Book;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {

    final BookRepository bookRepository;

    @NonNull
    public final Book getBookById(final Long id) {
        return bookRepository.findById(id).orElseThrow();
    }

}
