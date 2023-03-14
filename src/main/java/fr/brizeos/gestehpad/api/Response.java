package fr.brizeos.gestehpad.api;

import lombok.Data;

import java.util.Map;

@Data
public class Response<T> {

    private Map<String, T> body;

    public Response(String key, T body) {
        this.body = Map.of(key, body);
    }
}
