package br.com.dafiti.interactors;

import br.com.dafiti.entities.produto.request.RequestAdicionarImagemProduto;
import br.com.dafiti.repository.ProdutoRepository;

public class AdicionarImagemUseCase {

    private final ProdutoRepository produtoRepository;

    public AdicionarImagemUseCase(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    /**
     * Serviço responsável por adicionar uma imagem ao produto já criado.
     */
    public void executar(RequestAdicionarImagemProduto request) throws Exception {
        produtoRepository.adicionarImagemProduto(request);
    }
}
