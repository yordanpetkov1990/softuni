package TomovBanka;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CustomerInfoServer {
    private static LinkedList<String> listOfBranches = new LinkedList<>(List.of("123","456"));
    private static LinkedList<Customer> listOfCustomers = new LinkedList<>(List.of(new Customer(1,"yordan",1000000),
            new Customer(2,"georgi",100)));

    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(1211)){
            ExecutorService executorService = Executors.newCachedThreadPool();
            while (true){
                Socket accept = serverSocket.accept();
                executorService.execute(new ClientHandler(accept,listOfBranches,listOfCustomers));
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
