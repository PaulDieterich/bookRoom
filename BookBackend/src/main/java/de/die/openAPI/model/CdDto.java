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
 * CdDto
 */
@lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("Cd")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CdDto {

  private Long id;

  private String title;

  private String discription;

  private String artist;

  private String label;

  public CdDto id(Long id) {
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

  public CdDto title(String title) {
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

  public CdDto discription(String discription) {
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

  public CdDto artist(String artist) {
    this.artist = artist;
    return this;
  }

  /**
   * Get artist
   * @return artist
  */
  
  @Schema(name = "artist", example = "J.R.R. Tolkien", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("artist")
  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public CdDto label(String label) {
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
    CdDto cd = (CdDto) o;
    return Objects.equals(this.id, cd.id) &&
        Objects.equals(this.title, cd.title) &&
        Objects.equals(this.discription, cd.discription) &&
        Objects.equals(this.artist, cd.artist) &&
        Objects.equals(this.label, cd.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, discription, artist, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    discription: ").append(toIndentedString(discription)).append("\n");
    sb.append("    artist: ").append(toIndentedString(artist)).append("\n");
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

