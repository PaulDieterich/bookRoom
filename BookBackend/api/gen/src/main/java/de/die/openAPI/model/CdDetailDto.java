package de.die.openAPI.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CdDetailDto
 */
@lombok.Builder @lombok.NoArgsConstructor @lombok.AllArgsConstructor

@JsonTypeName("CdDetail")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CdDetailDto {

  private Long id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime modifiedAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  private String title;

  private String discription;

  private String artist;

  private String label;

  public CdDetailDto id(Long id) {
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

  public CdDetailDto modifiedAt(OffsetDateTime modifiedAt) {
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

  public CdDetailDto createdAt(OffsetDateTime createdAt) {
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

  public CdDetailDto title(String title) {
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

  public CdDetailDto discription(String discription) {
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

  public CdDetailDto artist(String artist) {
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

  public CdDetailDto label(String label) {
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
    CdDetailDto cdDetail = (CdDetailDto) o;
    return Objects.equals(this.id, cdDetail.id) &&
        Objects.equals(this.modifiedAt, cdDetail.modifiedAt) &&
        Objects.equals(this.createdAt, cdDetail.createdAt) &&
        Objects.equals(this.title, cdDetail.title) &&
        Objects.equals(this.discription, cdDetail.discription) &&
        Objects.equals(this.artist, cdDetail.artist) &&
        Objects.equals(this.label, cdDetail.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, modifiedAt, createdAt, title, discription, artist, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdDetailDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

