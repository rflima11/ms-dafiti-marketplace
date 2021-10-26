package br.com.dafiti.entities.pedido.response;

import br.com.dafiti.entities.pedido.BodyOrdersItensDTO;
import br.com.dafiti.entities.response.Head;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseObterPedidoItems {


    @JsonProperty("Head")
    private Head head;

    @JsonProperty("Body")
    private BodyOrdersItensDTO body;

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public BodyOrdersItensDTO getBody() {
        return body;
    }

    public void setBody(BodyOrdersItensDTO body) {
        this.body = body;
    }
}
