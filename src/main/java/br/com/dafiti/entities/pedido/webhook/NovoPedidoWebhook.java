package br.com.dafiti.entities.pedido.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NovoPedidoWebhook {

    @JsonProperty("event")
    private String event;
    @JsonProperty("Payload")
    private PayloadNewOrder payload;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public PayloadNewOrder getPayload() {
        return payload;
    }

    public void setPayload(PayloadNewOrder payload) {
        this.payload = payload;
    }
}
