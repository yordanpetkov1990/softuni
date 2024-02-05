package TomovBanka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;

public class ClientHandler implements Runnable {
    private Socket socket;
    private LinkedList<String> listOfBranches;
    private LinkedList<Customer> listOfCustomers;
    public ClientHandler(Socket accept, LinkedList<String> listOfBranches, LinkedList<Customer> listOfCustomers) {
        this.socket= accept;
        this.listOfBranches = listOfBranches;
        this.listOfCustomers=listOfCustomers;
    }

    @Override
    public void run() {
        try{
            PrintWriter pf = new PrintWriter(socket.getOutputStream(),true);
            BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String input = bf.readLine();
            if(!listOfBranches.contains(input)){
                pf.println("INVALID CODE!");
                return;
            }
            pf.println("OK!");
            input = bf.readLine();
            for (Customer customer : listOfCustomers) {
                if(customer.getCustomerId() == Integer.parseInt(input)){
                    pf.println(customer.toString());
                    return;
                }
            }
            pf.println("No such customer!");

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
