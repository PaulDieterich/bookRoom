package de.die.bookbackend.Controller.Converter;

import de.die.bookbackend.model.Author;
import de.die.openAPI.model.AuthorDto;

import java.util.List;
import java.util.stream.Collectors;

public class AuthorConverter {

    final static List<AuthorDto> convertToAuthorsDTO(final List<Author> authors) {
        return authors.stream().map(AuthorConverter::convertToAuthorDTO).collect(Collectors.toList());
    }

    public final static AuthorDto convertToAuthorDTO(final Author author) {
        return convertToAuthorDTOBuilder(author).build();
    }

    private final static AuthorDto.AuthorDtoBuilder convertToAuthorDTOBuilder(final Author author) {
        return AuthorDto.builder()
                .name(author.getName())
                .surname(author.getSurname());
    }

    public final static Author convertFromAuthorDTO(final AuthorDto authorDto) {
        return Author.builder()
                .name(authorDto.getName())
                .surname(authorDto.getSurname())
                .build();
    }

    public static List<Author> convertToAuthors(List<AuthorDto> author) {
        return author.stream().map(AuthorConverter::convertFromAuthorDTO).collect(Collectors.toList());
    }
}


