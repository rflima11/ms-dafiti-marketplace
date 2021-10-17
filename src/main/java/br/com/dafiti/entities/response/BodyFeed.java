package br.com.dafiti.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BodyFeed {

    @JsonProperty("FeedDetail")
    private FeedDetail feedDetail;

    public FeedDetail getFeedDetail() {
        return feedDetail;
    }

    public void setFeedDetail(FeedDetail feedDetail) {
        this.feedDetail = feedDetail;
    }
}
