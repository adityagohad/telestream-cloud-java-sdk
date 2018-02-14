/*
 * Qc API
 * QC API
 *
 * OpenAPI spec version: 2.0.0
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
import net.telestream.cloud.qc.Options;

/**
 * JobData
 */

public class JobData {
  @SerializedName("options")
  private Options options = null;

  @SerializedName("url")
  private String url = null;

  public JobData options(Options options) {
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @ApiModelProperty(value = "")
  public Options getOptions() {
    return options;
  }

  public void setOptions(Options options) {
    this.options = options;
  }

  public JobData url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobData jobData = (JobData) o;
    return Objects.equals(this.options, jobData.options) &&
        Objects.equals(this.url, jobData.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobData {\n");
    
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
