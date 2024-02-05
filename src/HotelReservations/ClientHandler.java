package HotelReservations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Map;

public class ClientHandler implements Runnable {
    private Socket clientSocket;

    public ClientHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try (PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            String command = reader.readLine();

            switch (command) {
                case "reserve":
                    String roomToReserve = reader.readLine();
                    HotelServer.reserveRoom(roomToReserve);
                    break;
                case "release":
                    String roomToRelease = reader.readLine();
                    HotelServer.releaseRoom(roomToRelease);
                    break;
                case "list":
                    Map<String, Room> rooms = HotelServer.getRooms();
                    for (Room room : rooms.values()) {
                        writer.println(room);
                    }
                    break;
                default:
                    writer.println("Invalid command.");
            }

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}

