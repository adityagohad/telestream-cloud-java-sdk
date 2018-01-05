/*
 * Flip API
 * Description
 *
 * OpenAPI spec version: 3.1.0
 * Contact: cloudsupport@telestream.net
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.telestream.cloud.flip;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UploadSession
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-05T16:30:52.273+01:00")
public class UploadSession {
  @SerializedName("id")
  private String id = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("parts")
  private Integer parts = null;

  @SerializedName("part_size")
  private Integer partSize = null;

  @SerializedName("max_connections")
  private Integer maxConnections = null;

  @SerializedName("extra_files")
  private Object extraFiles = null;

  public UploadSession id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An unique identifier of the UploadSession.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "An unique identifier of the UploadSession.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UploadSession location(String location) {
    this.location = location;
    return this;
  }

   /**
   * An URL to which chunks of the uploaded file should be sent
   * @return location
  **/
  @ApiModelProperty(required = true, value = "An URL to which chunks of the uploaded file should be sent")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public UploadSession parts(Integer parts) {
    this.parts = parts;
    return this;
  }

   /**
   * A number of chunks that are expected by the upstream.
   * @return parts
  **/
  @ApiModelProperty(value = "A number of chunks that are expected by the upstream.")
  public Integer getParts() {
    return parts;
  }

  public void setParts(Integer parts) {
    this.parts = parts;
  }

  public UploadSession partSize(Integer partSize) {
    this.partSize = partSize;
    return this;
  }

   /**
   * An expected size of uploaded chunks.
   * @return partSize
  **/
  @ApiModelProperty(value = "An expected size of uploaded chunks.")
  public Integer getPartSize() {
    return partSize;
  }

  public void setPartSize(Integer partSize) {
    this.partSize = partSize;
  }

  public UploadSession maxConnections(Integer maxConnections) {
    this.maxConnections = maxConnections;
    return this;
  }

   /**
   * A maximum number of concurrent connections.
   * @return maxConnections
  **/
  @ApiModelProperty(value = "A maximum number of concurrent connections.")
  public Integer getMaxConnections() {
    return maxConnections;
  }

  public void setMaxConnections(Integer maxConnections) {
    this.maxConnections = maxConnections;
  }

  public UploadSession extraFiles(Object extraFiles) {
    this.extraFiles = extraFiles;
    return this;
  }

   /**
   * An object containing additional files uploaded using the session.
   * @return extraFiles
  **/
  @ApiModelProperty(value = "An object containing additional files uploaded using the session.")
  public Object getExtraFiles() {
    return extraFiles;
  }

  public void setExtraFiles(Object extraFiles) {
    this.extraFiles = extraFiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadSession uploadSession = (UploadSession) o;
    return Objects.equals(this.id, uploadSession.id) &&
        Objects.equals(this.location, uploadSession.location) &&
        Objects.equals(this.parts, uploadSession.parts) &&
        Objects.equals(this.partSize, uploadSession.partSize) &&
        Objects.equals(this.maxConnections, uploadSession.maxConnections) &&
        Objects.equals(this.extraFiles, uploadSession.extraFiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, location, parts, partSize, maxConnections, extraFiles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadSession {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
    sb.append("    partSize: ").append(toIndentedString(partSize)).append("\n");
    sb.append("    maxConnections: ").append(toIndentedString(maxConnections)).append("\n");
    sb.append("    extraFiles: ").append(toIndentedString(extraFiles)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

