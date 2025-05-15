package repository;

import com.google.gson.Gson;
import model.TipoDeCambio;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaBaseDeDato {

    public TipoDeCambio tipoDeMoneda () throws IOException, InterruptedException {
        URI link = URI.create("https://api.fastforex.io/fetch-all?api_key=53329ae7b8-21eac80e52-swa138");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(link)
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        return new Gson().fromJson(response.body(), TipoDeCambio.class);

    }
}
