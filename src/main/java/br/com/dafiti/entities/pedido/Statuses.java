package br.com.dafiti.entities.pedido;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Statuses {

    @JsonProperty("Status")
    private List<String> status;

    public List<String> getStatus() {
        return status;
    }

    public void setStatus(List<String> status) {
        this.status = status;
    }
}
