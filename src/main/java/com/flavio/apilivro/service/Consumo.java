package com.flavio.apilivro.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consumo {

    HttpResponse<String> response;

    public String Buscaapi(String base_conversor , String target_code) {


        URI moedaBusca = URI.create("https://v6.exchangerate-api.com/v6/5c1a5ce51de6475848956f62/pair/" + base_conversor + "/" + target_code + "");

        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(moedaBusca)
                .build();

        HttpResponse<String> response;

        try {
            response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String json = response.body();
        return json;
    }


}
