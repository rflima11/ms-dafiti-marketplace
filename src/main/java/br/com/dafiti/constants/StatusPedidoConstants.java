package br.com.dafiti.constants;

public enum StatusPedidoConstants {

    PENDING("pending"),
    CANCELED("canceled"),
    READY_TO_SHIP("ready_to_ship"),
    DELIVERED("delivered"),
    RETURNED("returned"),
    SHIPPED("shipped");

    String value;

    StatusPedidoConstants(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
