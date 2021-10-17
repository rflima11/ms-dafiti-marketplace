package br.com.dafiti.constants;

public enum ApiConstants {

    USER_ID("vendasamiparis@gmail.com"),
    API_URL("https://api.sellercenter.com.br"),
    API_SCHEME("https"),
    API_HOST("api.sellercenter.com.br"),
    API_KEY("a45446bacd33bbea36e65c80b1b37d1bd7f9fd9c");

    String value;

    ApiConstants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
