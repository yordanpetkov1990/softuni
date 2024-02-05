package Bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;



public class ClientHandler implements Runnable{
    private Socket socket;
    private ArrayList<String> branches;
    private ArrayList<Customer> customers;

    public ClientHandler(Socket socket,ArrayList<String> branches,ArrayList<Customer> customers) {
        this.socket = socket;
        this.branches = branches;
        this.customers = customers;
    }

    @Override
    public void run() {
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pf = new PrintWriter(socket.getOutputStream(),true);
            String input = bf.readLine();
            if(branches.contains(input)){
                pf.println("OK!");
            }else{
                pf.println("INVALID CODE!");
                return;
            }
            input = bf.readLine();
            branches.add("alodaaaaaaaaaa1");
            branches.add("alodaaaaaaaaaa2");
            branches.add("alodaaaaaaaaaa3");
            for (Customer customer : customers) {
                if(customer.getCustomerID() == Integer.parseInt(input)){
                    pf.println(customer);
                    return;
                }
            }
          pf.println("No such customer!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
