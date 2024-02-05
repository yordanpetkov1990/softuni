package georgitest;

import izpit_java_tu_1.Participant;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try(Socket socket = new Socket("localhost",5555)){
            Scanner scanner = new Scanner(System.in);
            BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pf = new PrintWriter(socket.getOutputStream(),true);
            String input = scanner.nextLine();
            while (!input.equals("exit"))
            {
                if(input.trim().length()==0){
                    break;
                }
                pf.println(input);
                String response = bf.readLine();
                System.out.println(response);
                input = scanner.nextLine();
            }


        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
