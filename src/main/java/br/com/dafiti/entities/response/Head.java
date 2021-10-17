package br.com.dafiti.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Head {

    @JsonProperty("RequestId")
    private String requestId;
    @JsonProperty("RequestAction")
    private String requestAction;
    @JsonProperty("ResponseType")
    private String responseType;
    @JsonProperty("Timestamp")
    private Date timestamp;
    @JsonProperty("RequestParameters")
    private RequestParameters requestParameters;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestAction() {
        return requestAction;
    }

    public void setRequestAction(String requestAction) {
        this.requestAction = requestAction;
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public RequestParameters getRequestParameters() {
        return requestParameters;
    }

    public void setRequestParameters(RequestParameters requestParameters) {
        this.requestParameters = requestParameters;
    }
}
