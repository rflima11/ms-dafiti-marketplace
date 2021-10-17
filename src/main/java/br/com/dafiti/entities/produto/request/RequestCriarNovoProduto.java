package br.com.dafiti.entities.produto.request;

import br.com.dafiti.entities.produto.ProdutoDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "Request")
public class RequestCriarNovoProduto {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty(value = "Product")
    private List<ProdutoDTO> produtos;

    public List<ProdutoDTO> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoDTO> produtos) {
        this.produtos = produtos;
    }
}
