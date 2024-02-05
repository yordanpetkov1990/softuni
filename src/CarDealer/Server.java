package CarDealer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(5555)){
            ExecutorService executorService = Executors.newFixedThreadPool(3);
            while (true){
                Socket accept = serverSocket.accept();
                System.out.println("connected");
                executorService.execute(new ClientHandler(accept));
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
