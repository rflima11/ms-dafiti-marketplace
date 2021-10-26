package br.com.dafiti.utils;

import br.com.dafiti.constants.ActionConstants;
import com.rocketlabs.sellercenterapi.exceptions.SdkException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HttpUtilsTest {

    @Test
    void test() throws SdkException {

        var params = HttpUtils.defaultParamsApiCall(ActionConstants.GET_PRODUCT);
        var url = HttpUtils.montarUrl(params);

        System.out.println("a");
    }

}