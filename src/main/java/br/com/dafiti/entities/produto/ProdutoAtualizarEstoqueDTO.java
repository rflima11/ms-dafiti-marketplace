package br.com.dafiti.entities.produto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProdutoAtualizarEstoqueDTO {

    @JsonProperty("SellerSku")
    private String sellerSku;

    @JsonProperty("Quantity")
    private int quantidade;

    public String getSellerSku() {
        return sellerSku;
    }

    public void setSellerSku(String sellerSku) {
        this.sellerSku = sellerSku;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
