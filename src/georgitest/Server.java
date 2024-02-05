package georgitest;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static void main(String[] args)  {
        try(ServerSocket serverSocket = new ServerSocket(5555)){
            ExecutorService executorService = Executors.newFixedThreadPool(3);
            while (true){
                Socket clientSocket = serverSocket.accept();
                executorService.execute(new ClientHandler(clientSocket));
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

}
