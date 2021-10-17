package br.com.dafiti.entities.produto.response;

import br.com.dafiti.entities.produto.BodyProdutosDTO;
import br.com.dafiti.entities.response.Head;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "SuccessResponse")
public class ResponseListarProdutos {

    @JsonProperty("Head")
    private Head head;

    @JsonProperty("Body")
    private BodyProdutosDTO body;

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public BodyProdutosDTO getBody() {
        return body;
    }

    public void setBody(BodyProdutosDTO body) {
        this.body = body;
    }
}
