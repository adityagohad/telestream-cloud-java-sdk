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

/**
 * Job
 */

public class Job {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("original_filename")
  private String originalFilename = null;

  @SerializedName("project_id")
  private String projectId = null;

  @SerializedName("source_url")
  private String sourceUrl = null;

  /**
   * Determines the state of transcription job.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING("pending"),
    
    PREPARING("preparing"),
    
    PROCESSING("processing"),
    
    SUCCESS("success"),
    
    ERROR("error");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("error")
  private String error = null;

  @SerializedName("progress")
  private Integer progress = null;

  @SerializedName("confidence")
  private Integer confidence = null;

  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("bitrate")
  private Integer bitrate = null;

  @SerializedName("sample_rate")
  private Integer sampleRate = null;

  @SerializedName("format")
  private String format = null;

  @SerializedName("file_size")
  private String fileSize = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("updated_at")
  private String updatedAt = null;

  public Job id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the job.
   * @return id
  **/
  @ApiModelProperty(example = "7c0da16130b9418395e68f844de8ab20", value = "The ID of the job.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Job name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the job.
   * @return name
  **/
  @ApiModelProperty(example = "abcdef", value = "The name of the job.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Job originalFilename(String originalFilename) {
    this.originalFilename = originalFilename;
    return this;
  }

   /**
   * The name of the input file
   * @return originalFilename
  **/
  @ApiModelProperty(example = "demo.mp4", value = "The name of the input file")
  public String getOriginalFilename() {
    return originalFilename;
  }

  public void setOriginalFilename(String originalFilename) {
    this.originalFilename = originalFilename;
  }

  public Job projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * The ID of the project.
   * @return projectId
  **/
  @ApiModelProperty(example = "tg01a16130b9418395e68f844de8ab20", value = "The ID of the project.")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public Job sourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

   /**
   * The URL of source file.
   * @return sourceUrl
  **/
  @ApiModelProperty(example = "http://example.com/path/to/file.flac", value = "The URL of source file.")
  public String getSourceUrl() {
    return sourceUrl;
  }

  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  public Job status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Determines the state of transcription job.
   * @return status
  **/
  @ApiModelProperty(value = "Determines the state of transcription job.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Job error(String error) {
    this.error = error;
    return this;
  }

   /**
   * If the status of the job is &#39;error&#39;, returns the state of job.
   * @return error
  **/
  @ApiModelProperty(value = "If the status of the job is 'error', returns the state of job.")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public Job progress(Integer progress) {
    this.progress = progress;
    return this;
  }

   /**
   * A percentage that indicates the progress of the job.
   * @return progress
  **/
  @ApiModelProperty(example = "0", value = "A percentage that indicates the progress of the job.")
  public Integer getProgress() {
    return progress;
  }

  public void setProgress(Integer progress) {
    this.progress = progress;
  }

  public Job confidence(Integer confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * The confidence score of the job in the range of 0 to 100.
   * @return confidence
  **/
  @ApiModelProperty(value = "The confidence score of the job in the range of 0 to 100.")
  public Integer getConfidence() {
    return confidence;
  }

  public void setConfidence(Integer confidence) {
    this.confidence = confidence;
  }

  public Job duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * The duration of the input audio in milliseconds.
   * @return duration
  **/
  @ApiModelProperty(value = "The duration of the input audio in milliseconds.")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public Job bitrate(Integer bitrate) {
    this.bitrate = bitrate;
    return this;
  }

   /**
   * The bitrate of the input audio.
   * @return bitrate
  **/
  @ApiModelProperty(example = "192000", value = "The bitrate of the input audio.")
  public Integer getBitrate() {
    return bitrate;
  }

  public void setBitrate(Integer bitrate) {
    this.bitrate = bitrate;
  }

  public Job sampleRate(Integer sampleRate) {
    this.sampleRate = sampleRate;
    return this;
  }

   /**
   * The sample rate of the input audio.
   * @return sampleRate
  **/
  @ApiModelProperty(value = "The sample rate of the input audio.")
  public Integer getSampleRate() {
    return sampleRate;
  }

  public void setSampleRate(Integer sampleRate) {
    this.sampleRate = sampleRate;
  }

  public Job format(String format) {
    this.format = format;
    return this;
  }

   /**
   * The format of the input audio.
   * @return format
  **/
  @ApiModelProperty(example = "OGG_OPUS", value = "The format of the input audio.")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public Job fileSize(String fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * The file size of the input file.
   * @return fileSize
  **/
  @ApiModelProperty(value = "The file size of the input file.")
  public String getFileSize() {
    return fileSize;
  }

  public void setFileSize(String fileSize) {
    this.fileSize = fileSize;
  }

  public Job createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * A date and time when the job was created
   * @return createdAt
  **/
  @ApiModelProperty(example = "2017-01-02T03:04:05Z", value = "A date and time when the job was created")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Job updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * A date and time when the job was updated
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2017-01-02T03:04:05Z", value = "A date and time when the job was updated")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Job job = (Job) o;
    return Objects.equals(this.id, job.id) &&
        Objects.equals(this.name, job.name) &&
        Objects.equals(this.originalFilename, job.originalFilename) &&
        Objects.equals(this.projectId, job.projectId) &&
        Objects.equals(this.sourceUrl, job.sourceUrl) &&
        Objects.equals(this.status, job.status) &&
        Objects.equals(this.error, job.error) &&
        Objects.equals(this.progress, job.progress) &&
        Objects.equals(this.confidence, job.confidence) &&
        Objects.equals(this.duration, job.duration) &&
        Objects.equals(this.bitrate, job.bitrate) &&
        Objects.equals(this.sampleRate, job.sampleRate) &&
        Objects.equals(this.format, job.format) &&
        Objects.equals(this.fileSize, job.fileSize) &&
        Objects.equals(this.createdAt, job.createdAt) &&
        Objects.equals(this.updatedAt, job.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, originalFilename, projectId, sourceUrl, status, error, progress, confidence, duration, bitrate, sampleRate, format, fileSize, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Job {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originalFilename: ").append(toIndentedString(originalFilename)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
    sb.append("    sampleRate: ").append(toIndentedString(sampleRate)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

