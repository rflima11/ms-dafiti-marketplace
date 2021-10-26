package br.com.dafiti.datasources.http;

import br.com.dafiti.constants.ActionConstants;
import br.com.dafiti.constants.ApiConstants;
import br.com.dafiti.constants.ExceptionConstants;
import br.com.dafiti.datasources.http.exceptions.OkHttpException;
import br.com.dafiti.entities.produto.request.RequestAdicionarImagemProduto;
import br.com.dafiti.entities.produto.request.RequestAtualizarEstoqueProduto;
import br.com.dafiti.entities.produto.request.RequestCriarNovoProduto;
import br.com.dafiti.entities.produto.request.RequestDeletarProduto;
import br.com.dafiti.entities.produto.response.ResponseListarProdutos;
import br.com.dafiti.entities.response.SucessResponseDTO;
import br.com.dafiti.repository.ProdutoRepository;
import br.com.dafiti.utils.HttpUtils;
import br.com.dafiti.utils.OkHttpClientFactory;
import br.com.dafiti.utils.XmlMapperFactory;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.rocketlabs.sellercenterapi.exceptions.SdkException;
import okhttp3.*;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;

/**
 * Classe montada responsável pelas chamadas HTTP na API da Dafiti por meio do client OkHttpClient
 */
public class ProdutoDafiti implements ProdutoRepository {

    private static final Logger logger = LogManager.getLogger(ProdutoDafiti.class);

    private static final MediaType XML = MediaType.get("application/xml; charset=utf-8");

    private final OkHttpClient okHttpClient;
    private final Request.Builder requestBuilder;
    private final XmlMapper xmlMapper;

    public ProdutoDafiti() {
        this.okHttpClient = OkHttpClientFactory.getClient();
        this.requestBuilder = new Request.Builder();
        this.xmlMapper = XmlMapperFactory.getXmlMapper();
    }

    @Override
    public void atualizarProduto(RequestAtualizarEstoqueProduto atualizarProduto) throws Exception {
        try {
            var produto = xmlMapper.writeValueAsString(atualizarProduto);
            var body = RequestBody.create(produto, XML);
            var request = this.postRequest(body, ActionConstants.UPDATE_STOCK_PRODUCT);
            var response = this.okHttpClient.newCall(request).execute();
            if (isResponseError(response)) {
                throw new OkHttpException(ExceptionConstants.OK_HTTP_EXCEPTION_MSG.getValue(), response.code());
            }
        } catch (IOException e) {
            logger.info(ExceptionConstants.ERRO_CONVERTER_DTO.getValue() + e.getMessage());
        }
    }

    @Override
    public SucessResponseDTO criarProdutos(RequestCriarNovoProduto requestCriarNovoProduto) throws Exception {
        try {
            var produto = xmlMapper.writeValueAsString(requestCriarNovoProduto);
            var body = RequestBody.create(produto, XML);
            var request = this.postRequest(body, ActionConstants.CREATE_PRODUCT);
            var response = this.okHttpClient.newCall(request).execute();
            var responseAsString = response.body().string();


            if (isResponseError(response)) {
                throw new OkHttpException("Não foi possível realizar a chamada", response.code());
            }
            return xmlMapper.readValue(responseAsString, SucessResponseDTO.class);
        } catch (IOException e) {
            logger.info(ExceptionConstants.OK_HTTP_EXCEPTION_MSG.getValue() + e.getMessage());
        }
        return null;
    }

    @Override
    public void deletarProduto(RequestDeletarProduto requestDeletarProduto) throws Exception {
        try {
            var produto = xmlMapper.writeValueAsString(requestDeletarProduto);
            var body = RequestBody.create(produto, XML);
            var request = this.postRequest(body, ActionConstants.DELETE_PRODUCT);
            var response = this.okHttpClient.newCall(request).execute();
            if (isResponseError(response)) {
                throw new OkHttpException(ExceptionConstants.OK_HTTP_EXCEPTION_MSG.getValue(), response.code());
            }
        } catch (IOException e) {
            logger.info(ExceptionConstants.ERRO_CONVERTER_DTO.getValue() + e.getMessage());
        }
    }

    @Override
    public void adicionarImagemProduto(RequestAdicionarImagemProduto requestAdicionarImagemProduto) throws Exception {
        try {
            var produto = xmlMapper.writeValueAsString(requestAdicionarImagemProduto);
            var body = RequestBody.create(produto, XML);
            var request = this.postRequest(body, ActionConstants.IMAGE_PRODUCT);
            var response = this.okHttpClient.newCall(request).execute();
            if (isResponseError(response)) {
                throw new OkHttpException(ExceptionConstants.OK_HTTP_EXCEPTION_MSG.getValue(), response.code());
            }
        } catch (IOException e) {
            logger.info(ExceptionConstants.ERRO_CONVERTER_DTO.getValue() + e.getMessage());
        }
    }

    @Override
    public ResponseListarProdutos listarProdutos() throws Exception {
        try {
            var request = this.getRequest(ActionConstants.GET_PRODUCT);
            var response = this.okHttpClient.newCall(request).execute();
            var responseAsString = response.body().string();

            if (isResponseError(response)) {
                throw new OkHttpException(ExceptionConstants.OK_HTTP_EXCEPTION_MSG.getValue(), response.code());
            }

            return xmlMapper.readValue(responseAsString, ResponseListarProdutos.class);
        } catch (IOException e) {
            logger.info(ExceptionConstants.ERRO_CONVERTER_DTO.getValue() + e.getMessage());
        }
        return null;
    }

    public void getBrand() throws Exception {
        try {
            var request = this.getRequest(ActionConstants.BRAND);
            var response = this.okHttpClient.newCall(request).execute();
            if (isResponseError(response)) {
                throw new OkHttpException(ExceptionConstants.OK_HTTP_EXCEPTION_MSG.getValue(), response.code());
            }
        } catch (IOException e) {
            logger.info(ExceptionConstants.ERRO_CONVERTER_DTO.getValue() + e.getMessage());
        }
    }

    private Request getRequest(ActionConstants actionConstants) throws SdkException {
        return this.requestBuilder
                .url(HttpUtils.montarUrl(HttpUtils.defaultParamsApiCall(actionConstants)))
                .get()
                .build();
    }

    private Request postRequest(RequestBody body, ActionConstants actionConstants) throws SdkException {
        return this.requestBuilder
                .url(HttpUtils.montarUrl(HttpUtils.defaultParamsApiCall(actionConstants)))
                .post(body)
                .build();
    }

    private boolean isResponseError(Response response) {
        return !response.isSuccessful();
    }
}
