package de.die.bookbackend.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import de.die.bookbackend.model.AuthorDto;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BookDto
 */
@lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("Book")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BookDto {

  private Long id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime modifiedAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  private String language;

  private String title;

  private String isbn;

  private String discription;

  @Valid
  private List<@Valid AuthorDto> author;

  public BookDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "1234", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public BookDto modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Get modifiedAt
   * @return modifiedAt
  */
  @Valid 
  @Schema(name = "modifiedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modifiedAt")
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public BookDto createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @Valid 
  @Schema(name = "createdAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public BookDto language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
  */
  
  @Schema(name = "language", example = "de", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public BookDto title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", example = "The Lord of the Rings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public BookDto isbn(String isbn) {
    this.isbn = isbn;
    return this;
  }

  /**
   * Get isbn
   * @return isbn
  */
  
  @Schema(name = "isbn", example = "978-3-16-148410-0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isbn")
  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public BookDto discription(String discription) {
    this.discription = discription;
    return this;
  }

  /**
   * Get discription
   * @return discription
  */
  
  @Schema(name = "discription", example = "Der erste Band der Trilogie", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("discription")
  public String getDiscription() {
    return discription;
  }

  public void setDiscription(String discription) {
    this.discription = discription;
  }

  public BookDto author(List<@Valid AuthorDto> author) {
    this.author = author;
    return this;
  }

  public BookDto addAuthorItem(AuthorDto authorItem) {
    if (this.author == null) {
      this.author = new ArrayList<>();
    }
    this.author.add(authorItem);
    return this;
  }

  /**
   * Get author
   * @return author
  */
  @Valid 
  @Schema(name = "author", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("author")
  public List<@Valid AuthorDto> getAuthor() {
    return author;
  }

  public void setAuthor(List<@Valid AuthorDto> author) {
    this.author = author;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookDto book = (BookDto) o;
    return Objects.equals(this.id, book.id) &&
        Objects.equals(this.modifiedAt, book.modifiedAt) &&
        Objects.equals(this.createdAt, book.createdAt) &&
        Objects.equals(this.language, book.language) &&
        Objects.equals(this.title, book.title) &&
        Objects.equals(this.isbn, book.isbn) &&
        Objects.equals(this.discription, book.discription) &&
        Objects.equals(this.author, book.author);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, modifiedAt, createdAt, language, title, isbn, discription, author);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    isbn: ").append(toIndentedString(isbn)).append("\n");
    sb.append("    discription: ").append(toIndentedString(discription)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

