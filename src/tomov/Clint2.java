package tomov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Clint2 {
    public static void main(String[] args)  {
        try(Socket client = new Socket("localhost",5555)){
            while (true) {
                PrintWriter printWriter = new PrintWriter(client.getOutputStream(), true);
                BufferedReader bf = new BufferedReader(new InputStreamReader(client.getInputStream()));
                Scanner scanner = new Scanner(System.in);
                String echo = scanner.nextLine();
                printWriter.println(echo);
                if(echo.equals("exit")){
                    break;
                }
                System.out.println(bf.readLine());
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
