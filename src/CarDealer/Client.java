package CarDealer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost",5555);
            BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pf = new PrintWriter(socket.getOutputStream(),true);
            Scanner scan = new Scanner(System.in);
            String input;
            do{
                input = scan.nextLine();
                pf.println(input);
                String response = bf.readLine();
                System.out.println(response);
            }while (!input.equals("exit"));
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
