package br.com.dafiti.repository;

import br.com.dafiti.entities.produto.request.RequestAdicionarImagemProduto;
import br.com.dafiti.entities.produto.request.RequestAtualizarEstoqueProduto;
import br.com.dafiti.entities.produto.request.RequestCriarNovoProduto;
import br.com.dafiti.entities.produto.request.RequestDeletarProduto;
import br.com.dafiti.entities.produto.response.ResponseListarProdutos;
import br.com.dafiti.entities.response.SucessResponseDTO;

public interface ProdutoRepository {

    void atualizarProduto(RequestAtualizarEstoqueProduto request) throws Exception;

    SucessResponseDTO criarProdutos(RequestCriarNovoProduto request) throws Exception;

    void deletarProduto(RequestDeletarProduto request) throws Exception;

    void adicionarImagemProduto(RequestAdicionarImagemProduto request) throws Exception;

    ResponseListarProdutos listarProdutos() throws Exception;

}
