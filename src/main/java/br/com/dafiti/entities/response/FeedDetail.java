package br.com.dafiti.entities.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class FeedDetail {

    @JsonProperty("Feed")
    private String feed;
    @JsonProperty("Status")
    private String status;
    @JsonProperty("Action")
    private String action;
    @JsonProperty("CreationDate")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone= "UTC")
    private Date creationDate;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="UTC")
    @JsonProperty("UpdatedDate")
    private Date updatedDate;
    @JsonProperty("Source")
    private String source;
    @JsonProperty("TotalRecords")
    private int totalRecords;
    @JsonProperty("ProcessedRecords")
    private int processedRecords;
    @JsonProperty("FailedRecords")
    private int failedRecords;
    @JsonProperty("FeedErrors")
    private FeedErrors feedErrors;

    public String getFeed() {
        return feed;
    }

    public void setFeed(String feed) {
        this.feed = feed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    public int getProcessedRecords() {
        return processedRecords;
    }

    public void setProcessedRecords(int processedRecords) {
        this.processedRecords = processedRecords;
    }

    public int getFailedRecords() {
        return failedRecords;
    }

    public void setFailedRecords(int failedRecords) {
        this.failedRecords = failedRecords;
    }

    public FeedErrors getFeedErrors() {
        return feedErrors;
    }

    public void setFeedErrors(FeedErrors feedErrors) {
        this.feedErrors = feedErrors;
    }
}
