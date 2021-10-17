package br.com.dafiti.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SucessResponseDTO {

    @JsonProperty("Head")
    private Head head;
    @JsonProperty("Body")
    private BodyFeed body;

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public BodyFeed getBody() {
        return body;
    }

    public void setBody(BodyFeed body) {
        this.body = body;
    }
}
