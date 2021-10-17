package br.com.dafiti.datasources.http;

import br.com.dafiti.constants.ActionConstants;
import br.com.dafiti.constants.ExceptionConstants;
import br.com.dafiti.datasources.http.exceptions.OkHttpException;
import br.com.dafiti.entities.response.SucessResponseDTO;
import br.com.dafiti.repository.FeedRepository;
import br.com.dafiti.utils.HttpUtils;
import br.com.dafiti.utils.OkHttpClientFactory;
import br.com.dafiti.utils.XmlMapperFactory;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.rocketlabs.sellercenterapi.exceptions.SdkException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;

public class FeedDafiti implements FeedRepository {

    private static final Logger logger = LogManager.getLogger(FeedDafiti.class);

    private final OkHttpClient okHttpClient;
    private final Request.Builder requestBuilder;
    private final XmlMapper xmlMapper;

    public FeedDafiti() {
        this.okHttpClient = OkHttpClientFactory.getClient();
        this.requestBuilder = new Request.Builder();
        this.xmlMapper = XmlMapperFactory.getXmlMapper();
    }

    @Override
    public SucessResponseDTO feedStatus(String feedId) throws Exception {
        try {
            var request = this.getRequestFeedStatus(ActionConstants.FEED_STATUS, feedId);
            var response = this.okHttpClient.newCall(request).execute();
            var responseAsString = response.body().string();
            if (isResponseError(response)) {
                throw new OkHttpException(ExceptionConstants.OK_HTTP_EXCEPTION_MSG.getValue(), response.code());
            }
            return xmlMapper.readValue(responseAsString, SucessResponseDTO.class);
        } catch (IOException e) {
            logger.info(ExceptionConstants.ERRO_CONVERTER_DTO.getValue() + e.getMessage());
        }
        return null;
    }

    @Override
    public void feedList() throws Exception {
        try {
            var request = this.getRequestFeedList(ActionConstants.FEED_LIST);
            var response = this.okHttpClient.newCall(request).execute();
            if (isResponseError(response)) {
                throw new OkHttpException(ExceptionConstants.OK_HTTP_EXCEPTION_MSG.getValue(), response.code());
            }
        } catch (IOException e) {
            logger.info(ExceptionConstants.ERRO_CONVERTER_DTO.getValue() + e.getMessage());
        }

    }

    private Request getRequestFeedStatus(ActionConstants actionConstants, String feedId) throws SdkException {
        var params = HttpUtils.defaultParamsApiCall(actionConstants);
        params.put(ActionConstants.FEED_ID_KEY.getValue(), feedId);
        return this.requestBuilder
                .url(HttpUtils.montarUrl(params))
                .get()
                .build();
    }

    private Request getRequestFeedList(ActionConstants actionConstants) throws SdkException {
        return this.requestBuilder
                .url(HttpUtils.montarUrl(HttpUtils.defaultParamsApiCall(actionConstants)))
                .get()
                .build();
    }

    private boolean isResponseError(Response response) {
        return !response.isSuccessful();
    }

}
