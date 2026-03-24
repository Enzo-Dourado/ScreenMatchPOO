package TreinoAPI;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalApiGoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o livro que deseja pesquisar: ");
        String livro = sc.nextLine();
        String chaveApi = "AIzaSyCBiEx1CfVDb-pQtdeFVw11ResaNeNW3Fk";
        String url = "https://www.googleapis.com/books/v1/volumes?q=" + livro + "&key=" + chaveApi;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
