/*
 * Qc API
 * QC API
 *
 * OpenAPI spec version: 2.0.1
 * Contact: cloudsupport@telestream.net
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.telestream.cloud.qc;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Template
 */

public class Template {
  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("produces")
  private Map<String, String> produces = null;

  @SerializedName("takes")
  private Map<String, String> takes = null;

  public Template name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Template type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Template description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Template produces(Map<String, String> produces) {
    this.produces = produces;
    return this;
  }

  public Template putProducesItem(String key, String producesItem) {
    if (this.produces == null) {
      this.produces = new HashMap<String, String>();
    }
    this.produces.put(key, producesItem);
    return this;
  }

   /**
   * Get produces
   * @return produces
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getProduces() {
    return produces;
  }

  public void setProduces(Map<String, String> produces) {
    this.produces = produces;
  }

  public Template takes(Map<String, String> takes) {
    this.takes = takes;
    return this;
  }

  public Template putTakesItem(String key, String takesItem) {
    if (this.takes == null) {
      this.takes = new HashMap<String, String>();
    }
    this.takes.put(key, takesItem);
    return this;
  }

   /**
   * Get takes
   * @return takes
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getTakes() {
    return takes;
  }

  public void setTakes(Map<String, String> takes) {
    this.takes = takes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Template template = (Template) o;
    return Objects.equals(this.name, template.name) &&
        Objects.equals(this.type, template.type) &&
        Objects.equals(this.description, template.description) &&
        Objects.equals(this.produces, template.produces) &&
        Objects.equals(this.takes, template.takes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, description, produces, takes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Template {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    produces: ").append(toIndentedString(produces)).append("\n");
    sb.append("    takes: ").append(toIndentedString(takes)).append("\n");
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
