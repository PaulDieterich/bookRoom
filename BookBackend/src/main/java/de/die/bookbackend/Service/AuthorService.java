package de.die.bookbackend.Service;


import de.die.bookbackend.Repository.AuthorRepository;
import de.die.bookbackend.model.Author;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorService {


    final AuthorRepository authorRepository;


    @NonNull
    public void saveAuthor(@NonNull final Author author) {
        authorRepository.save(author);
    }

}
