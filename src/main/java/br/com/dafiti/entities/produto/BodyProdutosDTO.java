package br.com.dafiti.entities.produto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BodyProdutosDTO {

    @JsonProperty("Products")
    private List<ProdutoDTO> produtos;

    public List<ProdutoDTO> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoDTO> produtos) {
        this.produtos = produtos;
    }
}
