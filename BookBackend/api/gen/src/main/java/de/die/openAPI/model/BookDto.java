package de.die.openAPI.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import de.die.openAPI.model.AuthorDto;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BookDto
 */
@lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("Book")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BookDto {

  private Long id;

  private String language;

  private String title;

  private String isbn;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime releaseDate;

  private String discription;

  private String publisher;

  @Valid
  private List<@Valid AuthorDto> author;

  private String label;

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

  public BookDto releaseDate(OffsetDateTime releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  /**
   * Get releaseDate
   * @return releaseDate
  */
  @Valid 
  @Schema(name = "releaseDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("releaseDate")
  public OffsetDateTime getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(OffsetDateTime releaseDate) {
    this.releaseDate = releaseDate;
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

  public BookDto publisher(String publisher) {
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

  public BookDto label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
  */
  
  @Schema(name = "label", example = "Hörbuch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
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
        Objects.equals(this.language, book.language) &&
        Objects.equals(this.title, book.title) &&
        Objects.equals(this.isbn, book.isbn) &&
        Objects.equals(this.releaseDate, book.releaseDate) &&
        Objects.equals(this.discription, book.discription) &&
        Objects.equals(this.publisher, book.publisher) &&
        Objects.equals(this.author, book.author) &&
        Objects.equals(this.label, book.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, language, title, isbn, releaseDate, discription, publisher, author, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    isbn: ").append(toIndentedString(isbn)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    discription: ").append(toIndentedString(discription)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

