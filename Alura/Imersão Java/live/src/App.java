import com.sun.deploy.net.HttpRequest;
import sun.net.www.http.HttpClient;

public class App {
    public static void main(String[] args) throws Exception {
        //acessar a url
        var url = "https://imdb-api.com/en/API/Top250Movies/k_jl200gd6";
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(uri).build();
        
        client.send(request, HttpResponse.BodyHandlers.ofString());

        //pegar o JSON



        //imprimir o JSON
        System.out.println("Hello, World!");
    }
}