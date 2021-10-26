package br.com.dafiti.constants;

/**
 * Constantes utilizadas para configuração do RabbitMQ
 */
public enum RabbitConstants {

    EXCHANGE_NAME("envio.pedidos"),
    HOST_RABBIT("localhost"),
    VENDAS_PRODUTO_QUEUE("vendas.produto");

    String value;

    RabbitConstants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
