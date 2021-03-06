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
import java.util.ArrayList;
import java.util.List;
import net.telestream.cloud.tts.Corpus;

/**
 * CorporaCollection
 */

public class CorporaCollection {
  @SerializedName("corpora")
  private List<Corpus> corpora = null;

  public CorporaCollection corpora(List<Corpus> corpora) {
    this.corpora = corpora;
    return this;
  }

  public CorporaCollection addCorporaItem(Corpus corporaItem) {
    if (this.corpora == null) {
      this.corpora = new ArrayList<Corpus>();
    }
    this.corpora.add(corporaItem);
    return this;
  }

   /**
   * An array of Corpus files
   * @return corpora
  **/
  @ApiModelProperty(value = "An array of Corpus files")
  public List<Corpus> getCorpora() {
    return corpora;
  }

  public void setCorpora(List<Corpus> corpora) {
    this.corpora = corpora;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorporaCollection corporaCollection = (CorporaCollection) o;
    return Objects.equals(this.corpora, corporaCollection.corpora);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corpora);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorporaCollection {\n");
    
    sb.append("    corpora: ").append(toIndentedString(corpora)).append("\n");
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

