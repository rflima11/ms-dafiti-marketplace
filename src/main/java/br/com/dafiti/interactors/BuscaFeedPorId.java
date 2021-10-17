package br.com.dafiti.interactors;

import br.com.dafiti.entities.response.SucessResponseDTO;
import br.com.dafiti.repository.FeedRepository;

public class BuscaFeedPorId {

    private final FeedRepository feedRepository;

    public BuscaFeedPorId(FeedRepository feedRepository) {
        this.feedRepository = feedRepository;
    }

    public SucessResponseDTO executar(String feedId) throws Exception {
        return feedRepository.feedStatus(feedId);
    }
}
