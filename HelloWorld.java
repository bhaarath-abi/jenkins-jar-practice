 
import com.sun.net.httpserver.HttpServer;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class HelloWorld {

    public static void main(String[] args) throws Exception {

        HttpServer server = HttpServer.create(
            new InetSocketAddress(8081), 0);

        server.createContext("/", exchange -> {

            String response =
                "Hello from Jenkins CI/CD";

            exchange.sendResponseHeaders(
                200,
                response.length()
            );

            OutputStream os =
                exchange.getResponseBody();

            os.write(response.getBytes());

            os.close();
        });

        server.start();

        System.out.println(
            "Web Server Started on Port 8081"
        );
    }
}
