package br.com.dafiti.repository;

import br.com.dafiti.entities.response.SucessResponseDTO;

public interface FeedRepository {

    SucessResponseDTO feedStatus(String feedId) throws Exception;

    void feedList() throws Exception;

}
