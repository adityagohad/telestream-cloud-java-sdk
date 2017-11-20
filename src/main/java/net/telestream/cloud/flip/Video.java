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
 * Video
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-15T18:18:06.971+01:00")
public class Video {
  @SerializedName("id")
  private String id = null;

  @SerializedName("audio_bitrate")
  private Integer audioBitrate = null;

  @SerializedName("audio_channels")
  private Integer audioChannels = null;

  @SerializedName("audio_codec")
  private String audioCodec = null;

  @SerializedName("audio_sample_rate")
  private Integer audioSampleRate = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("encodings_count")
  private Integer encodingsCount = null;

  @SerializedName("error_class")
  private String errorClass = null;

  @SerializedName("error_message")
  private String errorMessage = null;

  @SerializedName("extname")
  private String extname = null;

  @SerializedName("file_size")
  private Integer fileSize = null;

  @SerializedName("fps")
  private String fps = null;

  @SerializedName("height")
  private String height = null;

  @SerializedName("width")
  private String width = null;

  @SerializedName("mime_type")
  private String mimeType = null;

  @SerializedName("original_filename")
  private String originalFilename = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("payload")
  private String payload = null;

  @SerializedName("source_url")
  private String sourceUrl = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("updated_at")
  private String updatedAt = null;

  @SerializedName("video_bitrate")
  private String videoBitrate = null;

  @SerializedName("video_codec")
  private String videoCodec = null;

  public Video id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identifier of the Video.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier of the Video.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Video audioBitrate(Integer audioBitrate) {
    this.audioBitrate = audioBitrate;
    return this;
  }

   /**
   * audio bitrate (in bits/s)
   * @return audioBitrate
  **/
  @ApiModelProperty(example = "128", value = "audio bitrate (in bits/s)")
  public Integer getAudioBitrate() {
    return audioBitrate;
  }

  public void setAudioBitrate(Integer audioBitrate) {
    this.audioBitrate = audioBitrate;
  }

  public Video audioChannels(Integer audioChannels) {
    this.audioChannels = audioChannels;
    return this;
  }

   /**
   * A number of audio channels.
   * @return audioChannels
  **/
  @ApiModelProperty(value = "A number of audio channels.")
  public Integer getAudioChannels() {
    return audioChannels;
  }

  public void setAudioChannels(Integer audioChannels) {
    this.audioChannels = audioChannels;
  }

  public Video audioCodec(String audioCodec) {
    this.audioCodec = audioCodec;
    return this;
  }

   /**
   * A codec that has been used to encode audio streams.
   * @return audioCodec
  **/
  @ApiModelProperty(value = "A codec that has been used to encode audio streams.")
  public String getAudioCodec() {
    return audioCodec;
  }

  public void setAudioCodec(String audioCodec) {
    this.audioCodec = audioCodec;
  }

  public Video audioSampleRate(Integer audioSampleRate) {
    this.audioSampleRate = audioSampleRate;
    return this;
  }

   /**
   * A number of samples of audio carried per second.
   * @return audioSampleRate
  **/
  @ApiModelProperty(value = "A number of samples of audio carried per second.")
  public Integer getAudioSampleRate() {
    return audioSampleRate;
  }

  public void setAudioSampleRate(Integer audioSampleRate) {
    this.audioSampleRate = audioSampleRate;
  }

  public Video createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * A date and time when the Video has been created.
   * @return createdAt
  **/
  @ApiModelProperty(value = "A date and time when the Video has been created.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Video duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * A duration of the video in seconds.
   * @return duration
  **/
  @ApiModelProperty(value = "A duration of the video in seconds.")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public Video encodingsCount(Integer encodingsCount) {
    this.encodingsCount = encodingsCount;
    return this;
  }

   /**
   * A number of related Encoding objects.
   * @return encodingsCount
  **/
  @ApiModelProperty(value = "A number of related Encoding objects.")
  public Integer getEncodingsCount() {
    return encodingsCount;
  }

  public void setEncodingsCount(Integer encodingsCount) {
    this.encodingsCount = encodingsCount;
  }

  public Video errorClass(String errorClass) {
    this.errorClass = errorClass;
    return this;
  }

   /**
   * A class of an error that has occurred during the encoding process. It is present only if the encoding status is equal to &#x60;fail&#x60;.
   * @return errorClass
  **/
  @ApiModelProperty(value = "A class of an error that has occurred during the encoding process. It is present only if the encoding status is equal to `fail`.")
  public String getErrorClass() {
    return errorClass;
  }

  public void setErrorClass(String errorClass) {
    this.errorClass = errorClass;
  }

  public Video errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * A message that explains why the encoding process has resulted in an error. It is present only if the encoding status is equal to &#x60;fail&#x60;.
   * @return errorMessage
  **/
  @ApiModelProperty(value = "A message that explains why the encoding process has resulted in an error. It is present only if the encoding status is equal to `fail`.")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public Video extname(String extname) {
    this.extname = extname;
    return this;
  }

   /**
   * Extension of the source file.
   * @return extname
  **/
  @ApiModelProperty(value = "Extension of the source file.")
  public String getExtname() {
    return extname;
  }

  public void setExtname(String extname) {
    this.extname = extname;
  }

  public Video fileSize(Integer fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * A size of the source file.
   * @return fileSize
  **/
  @ApiModelProperty(value = "A size of the source file.")
  public Integer getFileSize() {
    return fileSize;
  }

  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }

  public Video fps(String fps) {
    this.fps = fps;
    return this;
  }

   /**
   * Number of frames per second.
   * @return fps
  **/
  @ApiModelProperty(value = "Number of frames per second.")
  public String getFps() {
    return fps;
  }

  public void setFps(String fps) {
    this.fps = fps;
  }

  public Video height(String height) {
    this.height = height;
    return this;
  }

   /**
   * Height of the output video.
   * @return height
  **/
  @ApiModelProperty(value = "Height of the output video.")
  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public Video width(String width) {
    this.width = width;
    return this;
  }

   /**
   * Width of the output video.
   * @return width
  **/
  @ApiModelProperty(value = "Width of the output video.")
  public String getWidth() {
    return width;
  }

  public void setWidth(String width) {
    this.width = width;
  }

  public Video mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * A mime type of the source file.
   * @return mimeType
  **/
  @ApiModelProperty(value = "A mime type of the source file.")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public Video originalFilename(String originalFilename) {
    this.originalFilename = originalFilename;
    return this;
  }

   /**
   * A name of the source file.
   * @return originalFilename
  **/
  @ApiModelProperty(value = "A name of the source file.")
  public String getOriginalFilename() {
    return originalFilename;
  }

  public void setOriginalFilename(String originalFilename) {
    this.originalFilename = originalFilename;
  }

  public Video path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Video payload(String payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @ApiModelProperty(value = "")
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public Video sourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

   /**
   * An URL pointing to the source file.
   * @return sourceUrl
  **/
  @ApiModelProperty(value = "An URL pointing to the source file.")
  public String getSourceUrl() {
    return sourceUrl;
  }

  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  public Video status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Determines at what stage of importing process the Video is at the moment.
   * @return status
  **/
  @ApiModelProperty(value = "Determines at what stage of importing process the Video is at the moment.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Video updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * A date and time when a Video has been updated last time.
   * @return updatedAt
  **/
  @ApiModelProperty(value = "A date and time when a Video has been updated last time.")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Video videoBitrate(String videoBitrate) {
    this.videoBitrate = videoBitrate;
    return this;
  }

   /**
   * video bitrate (in bits/s)
   * @return videoBitrate
  **/
  @ApiModelProperty(value = "video bitrate (in bits/s)")
  public String getVideoBitrate() {
    return videoBitrate;
  }

  public void setVideoBitrate(String videoBitrate) {
    this.videoBitrate = videoBitrate;
  }

  public Video videoCodec(String videoCodec) {
    this.videoCodec = videoCodec;
    return this;
  }

   /**
   * A codec that has been used to encode the input file&#39;s video streams.
   * @return videoCodec
  **/
  @ApiModelProperty(value = "A codec that has been used to encode the input file's video streams.")
  public String getVideoCodec() {
    return videoCodec;
  }

  public void setVideoCodec(String videoCodec) {
    this.videoCodec = videoCodec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Video video = (Video) o;
    return Objects.equals(this.id, video.id) &&
        Objects.equals(this.audioBitrate, video.audioBitrate) &&
        Objects.equals(this.audioChannels, video.audioChannels) &&
        Objects.equals(this.audioCodec, video.audioCodec) &&
        Objects.equals(this.audioSampleRate, video.audioSampleRate) &&
        Objects.equals(this.createdAt, video.createdAt) &&
        Objects.equals(this.duration, video.duration) &&
        Objects.equals(this.encodingsCount, video.encodingsCount) &&
        Objects.equals(this.errorClass, video.errorClass) &&
        Objects.equals(this.errorMessage, video.errorMessage) &&
        Objects.equals(this.extname, video.extname) &&
        Objects.equals(this.fileSize, video.fileSize) &&
        Objects.equals(this.fps, video.fps) &&
        Objects.equals(this.height, video.height) &&
        Objects.equals(this.width, video.width) &&
        Objects.equals(this.mimeType, video.mimeType) &&
        Objects.equals(this.originalFilename, video.originalFilename) &&
        Objects.equals(this.path, video.path) &&
        Objects.equals(this.payload, video.payload) &&
        Objects.equals(this.sourceUrl, video.sourceUrl) &&
        Objects.equals(this.status, video.status) &&
        Objects.equals(this.updatedAt, video.updatedAt) &&
        Objects.equals(this.videoBitrate, video.videoBitrate) &&
        Objects.equals(this.videoCodec, video.videoCodec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, audioBitrate, audioChannels, audioCodec, audioSampleRate, createdAt, duration, encodingsCount, errorClass, errorMessage, extname, fileSize, fps, height, width, mimeType, originalFilename, path, payload, sourceUrl, status, updatedAt, videoBitrate, videoCodec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Video {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    audioBitrate: ").append(toIndentedString(audioBitrate)).append("\n");
    sb.append("    audioChannels: ").append(toIndentedString(audioChannels)).append("\n");
    sb.append("    audioCodec: ").append(toIndentedString(audioCodec)).append("\n");
    sb.append("    audioSampleRate: ").append(toIndentedString(audioSampleRate)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    encodingsCount: ").append(toIndentedString(encodingsCount)).append("\n");
    sb.append("    errorClass: ").append(toIndentedString(errorClass)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    extname: ").append(toIndentedString(extname)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fps: ").append(toIndentedString(fps)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    originalFilename: ").append(toIndentedString(originalFilename)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    videoBitrate: ").append(toIndentedString(videoBitrate)).append("\n");
    sb.append("    videoCodec: ").append(toIndentedString(videoCodec)).append("\n");
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

