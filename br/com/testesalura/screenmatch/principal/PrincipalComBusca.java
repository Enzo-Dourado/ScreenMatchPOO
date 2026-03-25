package br.com.testesalura.screenmatch.principal;

import br.com.testesalura.screenmatch.excecoes.ErroNoConversorDeAnoDeLancamentoException;
import br.com.testesalura.screenmatch.modelos.TituloOmdb;
import br.com.testesalura.screenmatch.modelos.Titulos;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String buscar = "";
        List<Titulos> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!buscar.equalsIgnoreCase("sair")) {
            System.out.println("Digite o nome do filme que você quer pesquisar:");
            buscar = sc.nextLine();

            if (buscar.equalsIgnoreCase("sair")) {
                break;
            }

            String url = "http://www.omdbapi.com/?t=" + buscar.replace(" ", "+") + "&apikey=addb957a";

            try {
                // Base para todas as chamadas de APIs
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                TituloOmdb meutitulo = gson.fromJson(json, TituloOmdb.class);

                Titulos meuTituloModificado = new Titulos(meutitulo);
                titulos.add(meuTituloModificado);

            } catch (NumberFormatException e) {
                System.out.println("Erro capturado: " + e.getMessage());

            } catch (IllegalArgumentException e) {
                System.out.println("Erro de busca capturado: " + e.getMessage());

            } catch (ErroNoConversorDeAnoDeLancamentoException e) {
                System.out.println("Erro no conversor de ano de lancamento: " + e.getMessage());
            }


        }
        System.out.println(titulos);
        FileWriter file = new FileWriter("titulos.json");
        file.write(gson.toJson(titulos));
        file.close();
    }
}
