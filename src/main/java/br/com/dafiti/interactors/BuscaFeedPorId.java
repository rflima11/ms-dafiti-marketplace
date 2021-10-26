package br.com.dafiti.interactors;

import br.com.dafiti.entities.response.SucessResponseDTO;
import br.com.dafiti.repository.FeedRepository;

public class BuscaFeedPorId {

    private final FeedRepository feedRepository;

    public BuscaFeedPorId(FeedRepository feedRepository) {
        this.feedRepository = feedRepository;
    }

    /**
     *  Busca o feed de informações pelo ID, é usado no momento da criação do produto para checar se houve algum erro.
     */
    public SucessResponseDTO executar(String feedId) throws Exception {
        return feedRepository.feedStatus(feedId);
    }
}
