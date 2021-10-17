package br.com.dafiti.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

public class FeedErrors {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Error")
    private List<Error> error;

    public List<Error> getError() {
        return error;
    }

    public void setError(List<Error> error) {
        this.error = error;
    }
}
