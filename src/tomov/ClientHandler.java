package tomov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable{
    private Socket socket;
    public ClientHandler(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            PrintWriter printWriter= new PrintWriter(socket.getOutputStream(),true);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true){
                String input = bufferedReader.readLine();
//                if(input.equals("exit")){
//                    break;
//                }
                printWriter.println(input);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
