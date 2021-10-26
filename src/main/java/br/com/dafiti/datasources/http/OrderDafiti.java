package br.com.dafiti.datasources.http;

import br.com.dafiti.constants.ActionConstants;
import br.com.dafiti.constants.ExceptionConstants;
import br.com.dafiti.datasources.http.exceptions.OkHttpException;
import br.com.dafiti.entities.pedido.response.ResponseObterPedido;
import br.com.dafiti.entities.pedido.response.ResponseObterPedidoItems;
import br.com.dafiti.repository.OrderRepository;
import br.com.dafiti.utils.HttpUtils;
import br.com.dafiti.utils.OkHttpClientFactory;
import br.com.dafiti.utils.XmlMapperFactory;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.rocketlabs.sellercenterapi.exceptions.SdkException;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;

/**
 * Classe montada responsável pelas chamadas HTTP na API da Dafiti por meio do client OkHttpClient
 */
public class OrderDafiti implements OrderRepository {

    private static final Logger logger = LogManager.getLogger(OrderDafiti.class);

    private static final MediaType XML = MediaType.get("application/xml; charset=utf-8");

    private final OkHttpClient okHttpClient;
    private final Request.Builder requestBuilder;
    private final XmlMapper xmlMapper;

    public OrderDafiti() {
        this.okHttpClient = OkHttpClientFactory.getClient();
        this.requestBuilder = new Request.Builder();
        this.xmlMapper = XmlMapperFactory.getXmlMapper();
    }

    @Override
    public ResponseObterPedido consultarPedido(Long orderId) throws OkHttpException {
        try {
            var request = this.getRequestFeedStatus(ActionConstants.GET_ORDER, orderId);
            var response = this.okHttpClient.newCall(request).execute();
            if (isResponseError(response)) {
                throw new OkHttpException(ExceptionConstants.OK_HTTP_EXCEPTION_MSG.getValue(), response.code());
            }
            var responseAsString = response.body().string();
            return xmlMapper.readValue(responseAsString, ResponseObterPedido.class);
        } catch (IOException | SdkException e) {
            logger.info(ExceptionConstants.ERRO_CONVERTER_DTO.getValue() + e.getMessage());
        }
        return null;
    }

    @Override
    public ResponseObterPedidoItems consultarItensPedido(Long orderId) throws Exception {
        try {
            var request = this.getRequestFeedStatus(ActionConstants.ORDER_GET_ITEMS, orderId);
            var response = this.okHttpClient.newCall(request).execute();
            if (isResponseError(response)) {
                throw new OkHttpException(ExceptionConstants.OK_HTTP_EXCEPTION_MSG.getValue(), response.code());
            }
            var responseAsString = response.body().string();
            return xmlMapper.readValue(responseAsString, ResponseObterPedidoItems.class);
        } catch (IOException | SdkException e) {
            logger.info(ExceptionConstants.ERRO_CONVERTER_DTO.getValue() + e.getMessage());
        }
        return null;
    }


    private Request getRequestFeedStatus(ActionConstants actionConstants, Long orderId) throws SdkException {
        var params = HttpUtils.defaultParamsApiCall(actionConstants);
        params.put(ActionConstants.ORDER_ID_KEY.getValue(), orderId.toString());
        return this.requestBuilder
                .url(HttpUtils.montarUrl(params))
                .get()
                .build();
    }

    private boolean isResponseError(Response response) {
        return !response.isSuccessful();
    }

}
