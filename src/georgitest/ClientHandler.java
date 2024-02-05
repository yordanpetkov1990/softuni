package georgitest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private Socket socket;
    public ClientHandler(Socket clientSocket) {
        this.socket = clientSocket;
    }

    @Override
    public void run() {
        try{
            BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pf = new PrintWriter(socket.getOutputStream(),true);
            String input = bf.readLine();
            while (input != null) {
                if(input.equals("exit")){
                    break;
                }
                if(input.trim().length()==0){
                    break;
                }
                pf.println(input);
                input = bf.readLine();
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
