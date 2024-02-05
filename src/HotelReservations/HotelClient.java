package HotelReservations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Map;

public class HotelClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5555);
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            System.out.println("Enter command (reserve, release, list):");
            String command = new BufferedReader(new InputStreamReader(System.in)).readLine();

            writer.println(command);

            switch (command) {
                case "reserve":
                case "release":
                    System.out.println("Enter room number:");
                    String roomNumber = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    writer.println(roomNumber);
                    break;
                case "list":
                    String response;
                    while ((response = reader.readLine()) != null) {
                        System.out.println(response);
                    }
                    break;
                default:
                    System.out.println("Invalid command.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}