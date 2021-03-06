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
import net.telestream.cloud.tts.ExtraFile;
import net.telestream.cloud.tts.Job;

/**
 * VideoUploadBody
 */

public class VideoUploadBody {
  @SerializedName("file_size")
  private Long fileSize = null;

  @SerializedName("file_name")
  private String fileName = null;

  @SerializedName("profiles")
  private String profiles = null;

  @SerializedName("multi_chunk")
  private Boolean multiChunk = true;

  @SerializedName("extra_files")
  private List<ExtraFile> extraFiles = null;

  @SerializedName("job")
  private Job job = null;

  public VideoUploadBody fileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * Size of the file that will be uploaded in &#x60;bytes&#x60;.
   * @return fileSize
  **/
  @ApiModelProperty(required = true, value = "Size of the file that will be uploaded in `bytes`.")
  public Long getFileSize() {
    return fileSize;
  }

  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }

  public VideoUploadBody fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Name of the file that will be uploaded.
   * @return fileName
  **/
  @ApiModelProperty(required = true, value = "Name of the file that will be uploaded.")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public VideoUploadBody profiles(String profiles) {
    this.profiles = profiles;
    return this;
  }

   /**
   * Get profiles
   * @return profiles
  **/
  @ApiModelProperty(value = "")
  public String getProfiles() {
    return profiles;
  }

  public void setProfiles(String profiles) {
    this.profiles = profiles;
  }

  public VideoUploadBody multiChunk(Boolean multiChunk) {
    this.multiChunk = multiChunk;
    return this;
  }

   /**
   * Get multiChunk
   * @return multiChunk
  **/
  @ApiModelProperty(value = "")
  public Boolean isMultiChunk() {
    return multiChunk;
  }

  public void setMultiChunk(Boolean multiChunk) {
    this.multiChunk = multiChunk;
  }

  public VideoUploadBody extraFiles(List<ExtraFile> extraFiles) {
    this.extraFiles = extraFiles;
    return this;
  }

  public VideoUploadBody addExtraFilesItem(ExtraFile extraFilesItem) {
    if (this.extraFiles == null) {
      this.extraFiles = new ArrayList<ExtraFile>();
    }
    this.extraFiles.add(extraFilesItem);
    return this;
  }

   /**
   * A list of names of additional files that will be uploaded.
   * @return extraFiles
  **/
  @ApiModelProperty(value = "A list of names of additional files that will be uploaded.")
  public List<ExtraFile> getExtraFiles() {
    return extraFiles;
  }

  public void setExtraFiles(List<ExtraFile> extraFiles) {
    this.extraFiles = extraFiles;
  }

  public VideoUploadBody job(Job job) {
    this.job = job;
    return this;
  }

   /**
   * Get job
   * @return job
  **/
  @ApiModelProperty(value = "")
  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoUploadBody videoUploadBody = (VideoUploadBody) o;
    return Objects.equals(this.fileSize, videoUploadBody.fileSize) &&
        Objects.equals(this.fileName, videoUploadBody.fileName) &&
        Objects.equals(this.profiles, videoUploadBody.profiles) &&
        Objects.equals(this.multiChunk, videoUploadBody.multiChunk) &&
        Objects.equals(this.extraFiles, videoUploadBody.extraFiles) &&
        Objects.equals(this.job, videoUploadBody.job);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSize, fileName, profiles, multiChunk, extraFiles, job);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoUploadBody {\n");
    
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
    sb.append("    multiChunk: ").append(toIndentedString(multiChunk)).append("\n");
    sb.append("    extraFiles: ").append(toIndentedString(extraFiles)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
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

