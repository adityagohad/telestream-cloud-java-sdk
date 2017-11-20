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
import java.util.ArrayList;
import java.util.List;

/**
 * Encoding
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-15T18:18:06.971+01:00")
public class Encoding {
  @SerializedName("id")
  private String id = null;

  @SerializedName("audio_bitrate")
  private Integer audioBitrate = null;

  @SerializedName("audio_channels")
  private Integer audioChannels = null;

  @SerializedName("audio_codec")
  private String audioCodec = null;

  @SerializedName("audio_sample_rate")
  private String audioSampleRate = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("duration")
  private String duration = null;

  @SerializedName("encoding_progress")
  private String encodingProgress = null;

  @SerializedName("encoding_time")
  private String encodingTime = null;

  @SerializedName("error_class")
  private String errorClass = null;

  @SerializedName("error_message")
  private String errorMessage = null;

  @SerializedName("external_id")
  private String externalId = null;

  @SerializedName("extname")
  private String extname = null;

  @SerializedName("file_size")
  private String fileSize = null;

  @SerializedName("files")
  private List<String> files = null;

  @SerializedName("fps")
  private String fps = null;

  @SerializedName("height")
  private String height = null;

  @SerializedName("width")
  private String width = null;

  @SerializedName("logfile_url")
  private String logfileUrl = null;

  @SerializedName("mime_type")
  private String mimeType = null;

  @SerializedName("parent_encoding_id")
  private String parentEncodingId = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("profile_id")
  private String profileId = null;

  @SerializedName("profile_name")
  private String profileName = null;

  @SerializedName("screenshots")
  private List<String> screenshots = null;

  @SerializedName("started_encoding_at")
  private String startedEncodingAt = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("updated_at")
  private String updatedAt = null;

  @SerializedName("video_bitrate")
  private String videoBitrate = null;

  @SerializedName("video_codec")
  private String videoCodec = null;

  @SerializedName("video_id")
  private String videoId = null;

  public Encoding id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identifier of an Encoding.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier of an Encoding.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Encoding audioBitrate(Integer audioBitrate) {
    this.audioBitrate = audioBitrate;
    return this;
  }

   /**
   * Audio bitrate (in bits/s).
   * @return audioBitrate
  **/
  @ApiModelProperty(example = "128", value = "Audio bitrate (in bits/s).")
  public Integer getAudioBitrate() {
    return audioBitrate;
  }

  public void setAudioBitrate(Integer audioBitrate) {
    this.audioBitrate = audioBitrate;
  }

  public Encoding audioChannels(Integer audioChannels) {
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

  public Encoding audioCodec(String audioCodec) {
    this.audioCodec = audioCodec;
    return this;
  }

   /**
   * A codec that is used to encode audio streams.
   * @return audioCodec
  **/
  @ApiModelProperty(value = "A codec that is used to encode audio streams.")
  public String getAudioCodec() {
    return audioCodec;
  }

  public void setAudioCodec(String audioCodec) {
    this.audioCodec = audioCodec;
  }

  public Encoding audioSampleRate(String audioSampleRate) {
    this.audioSampleRate = audioSampleRate;
    return this;
  }

   /**
   * A number of samples of audio carried per second.
   * @return audioSampleRate
  **/
  @ApiModelProperty(example = "44100", value = "A number of samples of audio carried per second.")
  public String getAudioSampleRate() {
    return audioSampleRate;
  }

  public void setAudioSampleRate(String audioSampleRate) {
    this.audioSampleRate = audioSampleRate;
  }

  public Encoding createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * A date and time when the Encoding has been created.
   * @return createdAt
  **/
  @ApiModelProperty(value = "A date and time when the Encoding has been created.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Encoding duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(value = "")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public Encoding encodingProgress(String encodingProgress) {
    this.encodingProgress = encodingProgress;
    return this;
  }

   /**
   * Get encodingProgress
   * @return encodingProgress
  **/
  @ApiModelProperty(value = "")
  public String getEncodingProgress() {
    return encodingProgress;
  }

  public void setEncodingProgress(String encodingProgress) {
    this.encodingProgress = encodingProgress;
  }

  public Encoding encodingTime(String encodingTime) {
    this.encodingTime = encodingTime;
    return this;
  }

   /**
   * Get encodingTime
   * @return encodingTime
  **/
  @ApiModelProperty(value = "")
  public String getEncodingTime() {
    return encodingTime;
  }

  public void setEncodingTime(String encodingTime) {
    this.encodingTime = encodingTime;
  }

  public Encoding errorClass(String errorClass) {
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

  public Encoding errorMessage(String errorMessage) {
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

  public Encoding externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @ApiModelProperty(value = "")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public Encoding extname(String extname) {
    this.extname = extname;
    return this;
  }

   /**
   * Extension of the output file.
   * @return extname
  **/
  @ApiModelProperty(value = "Extension of the output file.")
  public String getExtname() {
    return extname;
  }

  public void setExtname(String extname) {
    this.extname = extname;
  }

  public Encoding fileSize(String fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * A size of the output file.
   * @return fileSize
  **/
  @ApiModelProperty(value = "A size of the output file.")
  public String getFileSize() {
    return fileSize;
  }

  public void setFileSize(String fileSize) {
    this.fileSize = fileSize;
  }

  public Encoding files(List<String> files) {
    this.files = files;
    return this;
  }

  public Encoding addFilesItem(String filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<String>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * An array of output file names.
   * @return files
  **/
  @ApiModelProperty(value = "An array of output file names.")
  public List<String> getFiles() {
    return files;
  }

  public void setFiles(List<String> files) {
    this.files = files;
  }

  public Encoding fps(String fps) {
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

  public Encoding height(String height) {
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

  public Encoding width(String width) {
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

  public Encoding logfileUrl(String logfileUrl) {
    this.logfileUrl = logfileUrl;
    return this;
  }

   /**
   * An URL pointing to a logfile.
   * @return logfileUrl
  **/
  @ApiModelProperty(value = "An URL pointing to a logfile.")
  public String getLogfileUrl() {
    return logfileUrl;
  }

  public void setLogfileUrl(String logfileUrl) {
    this.logfileUrl = logfileUrl;
  }

  public Encoding mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * A mime type of the encoded file.
   * @return mimeType
  **/
  @ApiModelProperty(value = "A mime type of the encoded file.")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public Encoding parentEncodingId(String parentEncodingId) {
    this.parentEncodingId = parentEncodingId;
    return this;
  }

   /**
   * Get parentEncodingId
   * @return parentEncodingId
  **/
  @ApiModelProperty(value = "")
  public String getParentEncodingId() {
    return parentEncodingId;
  }

  public void setParentEncodingId(String parentEncodingId) {
    this.parentEncodingId = parentEncodingId;
  }

  public Encoding path(String path) {
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

  public Encoding profileId(String profileId) {
    this.profileId = profileId;
    return this;
  }

   /**
   * An id of a related Profile.
   * @return profileId
  **/
  @ApiModelProperty(value = "An id of a related Profile.")
  public String getProfileId() {
    return profileId;
  }

  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }

  public Encoding profileName(String profileName) {
    this.profileName = profileName;
    return this;
  }

   /**
   * A name of the used Profile.
   * @return profileName
  **/
  @ApiModelProperty(value = "A name of the used Profile.")
  public String getProfileName() {
    return profileName;
  }

  public void setProfileName(String profileName) {
    this.profileName = profileName;
  }

  public Encoding screenshots(List<String> screenshots) {
    this.screenshots = screenshots;
    return this;
  }

  public Encoding addScreenshotsItem(String screenshotsItem) {
    if (this.screenshots == null) {
      this.screenshots = new ArrayList<String>();
    }
    this.screenshots.add(screenshotsItem);
    return this;
  }

   /**
   * Get screenshots
   * @return screenshots
  **/
  @ApiModelProperty(value = "")
  public List<String> getScreenshots() {
    return screenshots;
  }

  public void setScreenshots(List<String> screenshots) {
    this.screenshots = screenshots;
  }

  public Encoding startedEncodingAt(String startedEncodingAt) {
    this.startedEncodingAt = startedEncodingAt;
    return this;
  }

   /**
   * A date and time when the encoding process has been started
   * @return startedEncodingAt
  **/
  @ApiModelProperty(value = "A date and time when the encoding process has been started")
  public String getStartedEncodingAt() {
    return startedEncodingAt;
  }

  public void setStartedEncodingAt(String startedEncodingAt) {
    this.startedEncodingAt = startedEncodingAt;
  }

  public Encoding status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Determines at what stage the encoding process is at the moment.
   * @return status
  **/
  @ApiModelProperty(value = "Determines at what stage the encoding process is at the moment.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Encoding updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * A date and time when a Encoding has been updated last time.
   * @return updatedAt
  **/
  @ApiModelProperty(value = "A date and time when a Encoding has been updated last time.")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Encoding videoBitrate(String videoBitrate) {
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

  public Encoding videoCodec(String videoCodec) {
    this.videoCodec = videoCodec;
    return this;
  }

   /**
   * A codec that is used to encode video streams.
   * @return videoCodec
  **/
  @ApiModelProperty(value = "A codec that is used to encode video streams.")
  public String getVideoCodec() {
    return videoCodec;
  }

  public void setVideoCodec(String videoCodec) {
    this.videoCodec = videoCodec;
  }

  public Encoding videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

   /**
   * An id of a related Video object
   * @return videoId
  **/
  @ApiModelProperty(value = "An id of a related Video object")
  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Encoding encoding = (Encoding) o;
    return Objects.equals(this.id, encoding.id) &&
        Objects.equals(this.audioBitrate, encoding.audioBitrate) &&
        Objects.equals(this.audioChannels, encoding.audioChannels) &&
        Objects.equals(this.audioCodec, encoding.audioCodec) &&
        Objects.equals(this.audioSampleRate, encoding.audioSampleRate) &&
        Objects.equals(this.createdAt, encoding.createdAt) &&
        Objects.equals(this.duration, encoding.duration) &&
        Objects.equals(this.encodingProgress, encoding.encodingProgress) &&
        Objects.equals(this.encodingTime, encoding.encodingTime) &&
        Objects.equals(this.errorClass, encoding.errorClass) &&
        Objects.equals(this.errorMessage, encoding.errorMessage) &&
        Objects.equals(this.externalId, encoding.externalId) &&
        Objects.equals(this.extname, encoding.extname) &&
        Objects.equals(this.fileSize, encoding.fileSize) &&
        Objects.equals(this.files, encoding.files) &&
        Objects.equals(this.fps, encoding.fps) &&
        Objects.equals(this.height, encoding.height) &&
        Objects.equals(this.width, encoding.width) &&
        Objects.equals(this.logfileUrl, encoding.logfileUrl) &&
        Objects.equals(this.mimeType, encoding.mimeType) &&
        Objects.equals(this.parentEncodingId, encoding.parentEncodingId) &&
        Objects.equals(this.path, encoding.path) &&
        Objects.equals(this.profileId, encoding.profileId) &&
        Objects.equals(this.profileName, encoding.profileName) &&
        Objects.equals(this.screenshots, encoding.screenshots) &&
        Objects.equals(this.startedEncodingAt, encoding.startedEncodingAt) &&
        Objects.equals(this.status, encoding.status) &&
        Objects.equals(this.updatedAt, encoding.updatedAt) &&
        Objects.equals(this.videoBitrate, encoding.videoBitrate) &&
        Objects.equals(this.videoCodec, encoding.videoCodec) &&
        Objects.equals(this.videoId, encoding.videoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, audioBitrate, audioChannels, audioCodec, audioSampleRate, createdAt, duration, encodingProgress, encodingTime, errorClass, errorMessage, externalId, extname, fileSize, files, fps, height, width, logfileUrl, mimeType, parentEncodingId, path, profileId, profileName, screenshots, startedEncodingAt, status, updatedAt, videoBitrate, videoCodec, videoId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Encoding {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    audioBitrate: ").append(toIndentedString(audioBitrate)).append("\n");
    sb.append("    audioChannels: ").append(toIndentedString(audioChannels)).append("\n");
    sb.append("    audioCodec: ").append(toIndentedString(audioCodec)).append("\n");
    sb.append("    audioSampleRate: ").append(toIndentedString(audioSampleRate)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    encodingProgress: ").append(toIndentedString(encodingProgress)).append("\n");
    sb.append("    encodingTime: ").append(toIndentedString(encodingTime)).append("\n");
    sb.append("    errorClass: ").append(toIndentedString(errorClass)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    extname: ").append(toIndentedString(extname)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    fps: ").append(toIndentedString(fps)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    logfileUrl: ").append(toIndentedString(logfileUrl)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    parentEncodingId: ").append(toIndentedString(parentEncodingId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    profileName: ").append(toIndentedString(profileName)).append("\n");
    sb.append("    screenshots: ").append(toIndentedString(screenshots)).append("\n");
    sb.append("    startedEncodingAt: ").append(toIndentedString(startedEncodingAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    videoBitrate: ").append(toIndentedString(videoBitrate)).append("\n");
    sb.append("    videoCodec: ").append(toIndentedString(videoCodec)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
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

