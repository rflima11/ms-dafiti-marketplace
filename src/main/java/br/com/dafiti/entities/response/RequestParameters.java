package br.com.dafiti.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestParameters {

    @JsonProperty("FeedID")
    private String feedId;

    public String getFeedId() {
        return feedId;
    }

    public void setFeedId(String feedId) {
        this.feedId = feedId;
    }
}
