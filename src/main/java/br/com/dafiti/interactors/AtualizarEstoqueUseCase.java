package br.com.dafiti.interactors;

import br.com.dafiti.entities.produto.request.RequestAtualizarEstoqueProduto;
import br.com.dafiti.repository.ProdutoRepository;

public class AtualizarEstoqueUseCase {

    private final ProdutoRepository produtoPort;

    public AtualizarEstoqueUseCase(ProdutoRepository produtoPort) {
        this.produtoPort = produtoPort;
    }

    public void executar(RequestAtualizarEstoqueProduto request) throws Exception {
        produtoPort.atualizarProduto(request);
    }
}
