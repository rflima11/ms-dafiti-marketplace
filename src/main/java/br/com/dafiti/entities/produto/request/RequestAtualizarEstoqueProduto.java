package br.com.dafiti.entities.produto.request;

import br.com.dafiti.entities.produto.ProdutoAtualizarEstoqueDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "Request")
public class RequestAtualizarEstoqueProduto {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty(value = "Product")
    private List<ProdutoAtualizarEstoqueDTO> produtos;

    public List<ProdutoAtualizarEstoqueDTO> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoAtualizarEstoqueDTO> produtos) {
        this.produtos = produtos;
    }
}
