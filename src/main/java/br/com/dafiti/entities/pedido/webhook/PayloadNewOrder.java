package br.com.dafiti.entities.pedido.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PayloadNewOrder {

    @JsonProperty("OrderId")
    private Long orderId;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}

