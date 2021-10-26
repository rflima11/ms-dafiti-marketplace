package br.com.dafiti.entities.pedido.response;

import br.com.dafiti.entities.pedido.BodyOrdersDTO;
import br.com.dafiti.entities.response.Head;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "SuccessResponse")
public class ResponseObterPedido {

    @JsonProperty("Head")
    private Head head;

    @JsonProperty("Body")
    private BodyOrdersDTO body;

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public BodyOrdersDTO getBody() {
        return body;
    }

    public void setBody(BodyOrdersDTO body) {
        this.body = body;
    }
}
