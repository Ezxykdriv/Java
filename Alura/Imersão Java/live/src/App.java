import com.sun.deploy.net.HttpRequest;
import sun.net.www.http.HttpClient;
import java.net.URI;

public class App {
    public static void main(String[] args) throws Exception {
        //acessar a url
        var url = "https://imdb-api.com/en/API/Top250Movies/k_jl200gd6";
        URI uri = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(uri).build();

        //pegar o JSON
        String json = client.send(request, HttpResponse.BodyHandlers.ofString()).body();

        //imprimir o JSON
        System.out.println(json);
    }
}