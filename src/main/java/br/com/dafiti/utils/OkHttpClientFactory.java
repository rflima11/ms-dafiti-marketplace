package br.com.dafiti.utils;

import okhttp3.OkHttpClient;

import java.util.concurrent.TimeUnit;

public class OkHttpClientFactory {

    private OkHttpClientFactory() { throw new IllegalStateException("Classe utilitária, não deve ser instanciada"); }

    public static OkHttpClient getClient() {
        return new OkHttpClient().newBuilder()
                .connectTimeout(1, TimeUnit.MINUTES)
                .callTimeout(1, TimeUnit.MINUTES)
                .readTimeout(1, TimeUnit.MINUTES)
                .build();
    }
}
