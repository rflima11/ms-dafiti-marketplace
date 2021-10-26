package br.com.dafiti.entities.pedido;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BodyOrdersDTO {

    @JsonProperty("0rders")
    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
