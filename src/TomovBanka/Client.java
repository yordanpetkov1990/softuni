package TomovBanka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try(Socket socket = new Socket("localhost",1211)){
            PrintWriter pf = new PrintWriter(socket.getOutputStream(),true);
            BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter id of branch");
            String branch = scan.nextLine();
            pf.println(branch);
            String response = bf.readLine();
            System.out.println(response);
            if(!response.equals("OK!")){
                return;
            }
            System.out.println("Enter customer Id");
            String customerId = scan.nextLine();
            pf.println(customerId);
            String s = bf.readLine();
            System.out.println(s);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
