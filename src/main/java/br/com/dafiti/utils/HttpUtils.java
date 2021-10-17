package br.com.dafiti.utils;

import br.com.dafiti.constants.ActionConstants;
import br.com.dafiti.constants.ApiConstants;
import com.rocketlabs.sellercenterapi.exceptions.SdkException;
import okhttp3.HttpUrl;

import java.util.HashMap;
import java.util.Map;

public class HttpUtils {

    private HttpUtils() { throw new IllegalStateException("Classe utilitária, não deve ser instanciada"); }

    public static HttpUrl montarUrl(Map<String, String> params) throws SdkException {
        var httpBuilder = HttpUrl.parse(ApiConstants.API_URL.getValue()).newBuilder();

        for(Map.Entry<String, String> param : params.entrySet()) {
            httpBuilder.addQueryParameter(param.getKey(), param.getValue());
        }

        httpBuilder.addQueryParameter(ActionConstants.SIGNATURE_KEY.getValue(), ApiUtils.sign(params));

        return httpBuilder.build();
    }

    public static Map<String, String> defaultParamsApiCall(ActionConstants actionConstants) {
        Map<String, String> map = new HashMap<>();
        map.put(ActionConstants.VERSION_KEY.getValue(), ActionConstants.VERSION.getValue());
        map.put(ActionConstants.ACTION_KEY.getValue(), actionConstants.getValue());
        map.put(ActionConstants.FORMAT_KEY.getValue(), ActionConstants.FORMART_JSON.getValue());
        map.put(ActionConstants.TIMESTAMP_KEY.getValue(), DateUtils.getDateAsIso8661());
        map.put(ActionConstants.USER_ID_KEY.getValue(), ApiConstants.USER_ID.getValue());
        return map;
    }

}
