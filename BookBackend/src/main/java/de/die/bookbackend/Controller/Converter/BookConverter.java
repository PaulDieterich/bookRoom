package de.die.bookbackend.Controller.Converter;


import de.die.bookbackend.model.Book;
import de.die.openAPI.model.BookDetailDto;
import de.die.openAPI.model.BookDto;
import de.die.openAPI.model.CreateBookDto;
import de.die.openAPI.model.UpdateBookDto;

public class BookConverter {

    public final static BookDto convertToBookDTO(final Book book) {
        return BookDto.builder().title(book.getTitle())
                .isbn(book.getIsbn())
                .discription(book.getDescription())
                .publisher(book.getPublisher())
                .language(book.getLanguage())
                .author(AuthorConverter.convertToAuthorsDTO(book.getAuthor()))
                .build();
    }
    public final static BookDetailDto convertToBookDetailDTO(final Book book) {
        return BookDetailDto.builder().title(book.getTitle())
                .id(book.getId())
                .isbn(book.getIsbn())
                .discription(book.getDescription())
                .publisher(book.getPublisher())
                .releaseDate(book.getReleaseDate().atOffset(java.time.ZoneOffset.UTC))
                .modifiedAt(book.getModifiedAt().atOffset(java.time.ZoneOffset.UTC))
                .createdAt(book.getCreatedAt().atOffset(java.time.ZoneOffset.UTC))
                .language(book.getLanguage())
                .author(AuthorConverter.convertToAuthorsDTO(book.getAuthor()))
                .build();
    }
    public final static Book convertoFromBookDetailDTO(final BookDetailDto bookDto) {
        return Book.builder().title(bookDto.getTitle())
                .isbn(bookDto.getIsbn())
                .description(bookDto.getDiscription())
                .releaseDate(bookDto.getReleaseDate().toInstant())
                .language(bookDto.getLanguage())
                .publisher(bookDto.getPublisher())
                .author(AuthorConverter.convertToAuthors(bookDto.getAuthor()))
                .publisher(bookDto.getPublisher())
                .language(bookDto.getLanguage())
                .build();
    }

    public final static Book convertFromBookDTO(final BookDto bookDto) {
        return Book.builder().title(bookDto.getTitle())
                .isbn(bookDto.getIsbn())
                .description(bookDto.getDiscription())
                .publisher(bookDto.getPublisher())
                .language(bookDto.getLanguage())
                .build();
    }
    public final static Book convertFromExistingBook(final UpdateBookDto bookDto, final Book book) {
        return book.toBuilder().title(bookDto.getTitle())
                .isbn(bookDto.getIsbn())
                .description(bookDto.getDiscription())
                .publisher(bookDto.getPublisher())
                .language(bookDto.getLanguage())
                .build();
    }
    public final static Book convertFromCreateBookDTO(final CreateBookDto dto){
        return Book.builder().title(dto.getTitle())
                .isbn(dto.getIsbn())
                .description(dto.getDiscription())
                .publisher(dto.getPublisher())
                .language(dto.getLanguage())
                .build();
    }
}
