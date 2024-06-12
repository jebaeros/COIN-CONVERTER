package Elementos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consulta {

    public Moneda obtenerDatos(String eleccion) throws IOException, InterruptedException {
        String link_Api = "https://v6.exchangerate-api.com/v6/b99c1765ca2e33cc5de490b7/latest/" + eleccion;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(link_Api))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String respuesta = response.body();
        return new Gson().fromJson(respuesta,Moneda.class);
    }
}
