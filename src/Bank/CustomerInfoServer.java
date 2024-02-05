package Bank;

import izpit_java_tu_1.Participant;
import tomov.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class CustomerInfoServer {
    private static  ArrayList<String> listOfBranches =new ArrayList<>(List.of("123","456"));
    private static  ArrayList<Customer> listOfCustomers= new ArrayList<>(List.of(new Customer(1,"yordan",2000),
           new Customer(2,"boyan",3000)));
    private int port;
    private ServerSocket serverSocket;

    public CustomerInfoServer(int port){
        this.port = port;
    }
    public void run(){
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        try{
            serverSocket = new ServerSocket(port);
            while (true){
                Socket client = serverSocket.accept();
                executorService.execute(new ClientHandler(client,listOfBranches,listOfCustomers));
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

//    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//       try(ServerSocket socket = new ServerSocket(1211)){
//           while (true){
//               Socket accept = socket.accept();
//               executorService.execute(new ClientHandler(accept,listOfBranches,listOfCustomers));
//           }
//
//       }catch (IOException e){
//           System.out.println(e.getMessage());
//       }
//    }


}
