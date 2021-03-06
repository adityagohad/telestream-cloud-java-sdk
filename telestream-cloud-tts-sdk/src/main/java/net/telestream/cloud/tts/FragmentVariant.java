/*
 * Tts API
 * Description
 *
 * OpenAPI spec version: 2.0.0
 * Contact: cloudsupport@telestream.net
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.telestream.cloud.tts;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * FragmentVariant
 */

public class FragmentVariant {
  @SerializedName("fragment")
  private String fragment = null;

  @SerializedName("confidence")
  private BigDecimal confidence = null;

  public FragmentVariant fragment(String fragment) {
    this.fragment = fragment;
    return this;
  }

   /**
   * An alternative hypothesis for a fragment from the input audio.
   * @return fragment
  **/
  @ApiModelProperty(example = "Lorem", value = "An alternative hypothesis for a fragment from the input audio.")
  public String getFragment() {
    return fragment;
  }

  public void setFragment(String fragment) {
    this.fragment = fragment;
  }

  public FragmentVariant confidence(BigDecimal confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * The confidence score of the fragment variant hypothesis in the range of 0 to 1.
   * @return confidence
  **/
  @ApiModelProperty(example = "0.9", value = "The confidence score of the fragment variant hypothesis in the range of 0 to 1.")
  public BigDecimal getConfidence() {
    return confidence;
  }

  public void setConfidence(BigDecimal confidence) {
    this.confidence = confidence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FragmentVariant fragmentVariant = (FragmentVariant) o;
    return Objects.equals(this.fragment, fragmentVariant.fragment) &&
        Objects.equals(this.confidence, fragmentVariant.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fragment, confidence);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FragmentVariant {\n");
    
    sb.append("    fragment: ").append(toIndentedString(fragment)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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

