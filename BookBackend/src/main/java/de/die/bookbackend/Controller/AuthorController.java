package de.die.bookbackend.Controller;

import de.die.openAPI.api.AuthorsApi;
import de.die.openAPI.model.AuthorDto;
import de.die.openAPI.model.CreateAuthorDto;
import de.die.openAPI.model.UpdateAuthorDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class AuthorController implements AuthorsApi {

    @Override
    public ResponseEntity<List<AuthorDto>> getAllAuthors() {
        return AuthorsApi.super.getAllAuthors();
    }

    @Override
    public ResponseEntity<AuthorDto> getAuthorById(Long authorId) {
        return AuthorsApi.super.getAuthorById(authorId);
    }

    @Override
    public ResponseEntity<AuthorDto> updateAuthor(Long authorId, UpdateAuthorDto updateAuthorDto) {
        return AuthorsApi.super.updateAuthor(authorId, updateAuthorDto);
    }
    public ResponseEntity<AuthorDto> createAuthor(CreateAuthorDto authorDto) {
        return AuthorsApi.super.createAuthor(authorDto);
    }

    @Override
    public ResponseEntity<Void> deleteAuthor(Long authorId) {
        return AuthorsApi.super.deleteAuthor(authorId);
    }
}
