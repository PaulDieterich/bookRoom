package de.die.openAPI.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateBookDto
 */
@lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("CreateBook")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CreateBookDto {

  private String language;

  private String title;

  private String publisher;

  private String isbn;

  private String discription;

  public CreateBookDto language(String language) {
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

  public CreateBookDto title(String title) {
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

  public CreateBookDto publisher(String publisher) {
    this.publisher = publisher;
    return this;
  }

  /**
   * Get publisher
   * @return publisher
  */
  
  @Schema(name = "publisher", example = "xyz-publisher", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publisher")
  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public CreateBookDto isbn(String isbn) {
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

  public CreateBookDto discription(String discription) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBookDto createBook = (CreateBookDto) o;
    return Objects.equals(this.language, createBook.language) &&
        Objects.equals(this.title, createBook.title) &&
        Objects.equals(this.publisher, createBook.publisher) &&
        Objects.equals(this.isbn, createBook.isbn) &&
        Objects.equals(this.discription, createBook.discription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, title, publisher, isbn, discription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBookDto {\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    isbn: ").append(toIndentedString(isbn)).append("\n");
    sb.append("    discription: ").append(toIndentedString(discription)).append("\n");
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

