package br.com.dafiti.interactors;

import br.com.dafiti.entities.produto.request.RequestCriarNovoProduto;
import br.com.dafiti.interactors.exceptions.ErroCriacaoProdutoException;
import br.com.dafiti.repository.ProdutoRepository;

import java.util.Objects;
import java.util.stream.Collectors;

public class CriarNovoProdutoUseCase {

    private final BuscaFeedPorId buscaFeedPorId;
    private final ProdutoRepository produtoRepository;

    public CriarNovoProdutoUseCase(BuscaFeedPorId buscaFeedPorId, ProdutoRepository produtoRepository) {
        this.buscaFeedPorId = buscaFeedPorId;
        this.produtoRepository = produtoRepository;
    }

    /**
     *  Primeiramente faz uma requisição para a criação de produto e em segundo momento faz uma segunda chamada para receber o feed e checar
     *  se o produto foi criado ou não, caso não tenha sido criado levanta a exceção ErroCriacaoProdutoException.
     */
    public void executar(RequestCriarNovoProduto request) throws Exception {
        var response = produtoRepository.criarProdutos(request);
        Thread.sleep(3000);
        var feed = buscaFeedPorId.executar(response.getHead().getRequestId());

        if (Objects.nonNull(feed.getBody().getFeedDetail().getFeedErrors())) {
            throw new ErroCriacaoProdutoException(feed.getBody().getFeedDetail().getFeedErrors().getError().stream().map(er -> "ID: " + er.getCode() + "MSG: " + er.getMessage()).collect(Collectors.joining()));
        }
    }
 }
