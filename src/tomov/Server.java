package tomov;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Server {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(5555)) {
            ExecutorService executorService = Executors.newFixedThreadPool(4);
            while (true){
                Socket clientSocket = serverSocket.accept();
                executorService.execute(new ClientHandler(clientSocket));
            }


        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
