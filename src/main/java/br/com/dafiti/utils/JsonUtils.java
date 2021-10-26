package br.com.dafiti.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.StringReader;
import java.util.Map;

/**
 * Métodos utilitários para trabalhar com JSON
 */
public class JsonUtils {

    private JsonUtils() { throw new IllegalStateException("Classe utilitária, não deve ser instanciada"); }

    public static Map<String, Object> jsonToMap(Object obj) {
        return new ObjectMapper().convertValue(obj, new TypeReference<Map<String, Object>>() {});
    }

    public static JsonObject toJsonObject(String jsonAsString) {
        JsonReader jsonReader = Json.createReader(new StringReader(jsonAsString));
        JsonObject object = jsonReader.readObject();
        jsonReader.close();
        return object;
    }

}
