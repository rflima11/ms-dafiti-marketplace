package br.com.dafiti.interactors;

import br.com.dafiti.entities.produto.request.RequestDeletarProduto;
import br.com.dafiti.repository.ProdutoRepository;

public class DeletarProdutoUseCase {

    private final ProdutoRepository produtoRepository;

    public DeletarProdutoUseCase(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public void executar(RequestDeletarProduto request) throws Exception {
        produtoRepository.deletarProduto(request);
    }
}
