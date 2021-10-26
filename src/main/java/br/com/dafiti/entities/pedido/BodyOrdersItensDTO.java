package br.com.dafiti.entities.pedido;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rocketlabs.sellercenterapi.entities.OrderItem;

import java.util.List;

public class BodyOrdersItensDTO {

    @JsonProperty("OrderItems")
    private List<OrderItem> ordersItems;

    public List<OrderItem> getOrdersItems() {
        return ordersItems;
    }

    public void setOrdersItems(List<OrderItem> ordersItems) {
        this.ordersItems = ordersItems;
    }
}
