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
 * CreateEncodingBody
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-15T18:18:06.971+01:00")
public class CreateEncodingBody {
  @SerializedName("video_id")
  private String videoId = null;

  @SerializedName("profile_id")
  private String profileId = null;

  @SerializedName("profile_name")
  private String profileName = null;

  public CreateEncodingBody videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

   /**
   * Id of a Video that will be encoded.
   * @return videoId
  **/
  @ApiModelProperty(required = true, value = "Id of a Video that will be encoded.")
  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }

  public CreateEncodingBody profileId(String profileId) {
    this.profileId = profileId;
    return this;
  }

   /**
   * Id of a Profile that will be used for encoding.
   * @return profileId
  **/
  @ApiModelProperty(value = "Id of a Profile that will be used for encoding.")
  public String getProfileId() {
    return profileId;
  }

  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }

  public CreateEncodingBody profileName(String profileName) {
    this.profileName = profileName;
    return this;
  }

   /**
   * A name of a Profile that will be used for encoding.
   * @return profileName
  **/
  @ApiModelProperty(value = "A name of a Profile that will be used for encoding.")
  public String getProfileName() {
    return profileName;
  }

  public void setProfileName(String profileName) {
    this.profileName = profileName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEncodingBody createEncodingBody = (CreateEncodingBody) o;
    return Objects.equals(this.videoId, createEncodingBody.videoId) &&
        Objects.equals(this.profileId, createEncodingBody.profileId) &&
        Objects.equals(this.profileName, createEncodingBody.profileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoId, profileId, profileName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEncodingBody {\n");
    
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    profileName: ").append(toIndentedString(profileName)).append("\n");
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

