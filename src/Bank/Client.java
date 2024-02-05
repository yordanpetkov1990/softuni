package Bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try(Socket socket = new Socket("localhost",1211)){
            BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pf = new PrintWriter(socket.getOutputStream(),true);
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter id of branch");
            String input = scan.nextLine();
            pf.println(input);
            String response = bf.readLine();
            System.out.println(response);
            if(!response.equals("OK!")){
                return;
            }
            System.out.println("Enter id of customer");
            input = scan.nextLine();
            pf.println(input);
            response = bf.readLine();
            System.out.println(response);


        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
