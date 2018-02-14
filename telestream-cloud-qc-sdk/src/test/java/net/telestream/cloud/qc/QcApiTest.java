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

import net.telestream.cloud.qc.ApiException;
import net.telestream.cloud.qc.Data;
import net.telestream.cloud.qc.Data1;
import net.telestream.cloud.qc.Job;
import net.telestream.cloud.qc.JobData;
import net.telestream.cloud.qc.JobsCollection;
import net.telestream.cloud.qc.Project;
import net.telestream.cloud.qc.Proxy;
import net.telestream.cloud.qc.UploadSession;
import net.telestream.cloud.qc.VideoUploadBody;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QcApi
 */
@Ignore
public class QcApiTest {

    private final QcApi api = new QcApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelJobTest() throws ApiException {
        String projectId = null;
        String jobId = null;
        api.cancelJob(projectId, jobId);

        // TODO: test validations
    }
    
    /**
     * Create a new job
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createJobTest() throws ApiException {
        String projectId = null;
        JobData data = null;
        Job response = api.createJob(projectId, data);

        // TODO: test validations
    }
    
    /**
     * Create a new project
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createProjectTest() throws ApiException {
        Data data = null;
        Project response = api.createProject(data);

        // TODO: test validations
    }
    
    /**
     * Get QC job
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobTest() throws ApiException {
        String projectId = null;
        String jobId = null;
        Job response = api.getJob(projectId, jobId);

        // TODO: test validations
    }
    
    /**
     * Get project by Id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectTest() throws ApiException {
        String projectId = null;
        Project response = api.getProject(projectId);

        // TODO: test validations
    }
    
    /**
     * Get jobs form projects
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listJobsTest() throws ApiException {
        String projectId = null;
        Boolean expand = null;
        String status = null;
        Integer perPage = null;
        Integer page = null;
        JobsCollection response = api.listJobs(projectId, expand, status, perPage, page);

        // TODO: test validations
    }
    
    /**
     * List all projects for an account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listProjectsTest() throws ApiException {
        List<Project> response = api.listProjects();

        // TODO: test validations
    }
    
    /**
     * Modify project
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modifyProjectTest() throws ApiException {
        String projectId = null;
        Data1 data = null;
        Project response = api.modifyProject(projectId, data);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void proxyTest() throws ApiException {
        String projectId = null;
        String jobId = null;
        Proxy response = api.proxy(projectId, jobId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeJobTest() throws ApiException {
        String projectId = null;
        String jobId = null;
        api.removeJob(projectId, jobId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeProjectTest() throws ApiException {
        String projectId = null;
        api.removeProject(projectId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void signedUrlsTest() throws ApiException {
        String projectId = null;
        String jobId = null;
        Map<String, String> response = api.signedUrls(projectId, jobId);

        // TODO: test validations
    }
    
    /**
     * Creates an upload session
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadVideoTest() throws ApiException {
        String projectId = null;
        VideoUploadBody videoUploadBody = null;
        UploadSession response = api.uploadVideo(projectId, videoUploadBody);

        // TODO: test validations
    }
    
}
