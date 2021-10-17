package br.com.dafiti.datasources.http.exceptions;

public class OkHttpException extends Exception {

    public OkHttpException(String msg, int statusCode) {
        super(statusCode + msg);
    }
}
