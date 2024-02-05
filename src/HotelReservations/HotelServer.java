package HotelReservations;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HotelServer {
    private static Map<String, Room> rooms = Collections.synchronizedMap(new HashMap<>());
    private static final Object lock = new Object();

    public static void main(String[] args) {
        initializeRooms();

        try (ServerSocket serverSocket = new ServerSocket(5555)) {
            ExecutorService executorService = Executors.newCachedThreadPool();

            while (true) {
                Socket clientSocket = serverSocket.accept();
                executorService.submit(new ClientHandler(clientSocket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void initializeRooms() {
        Room room1 = new Room("101", "single", 100.0, true);
        Room room2 = new Room("102", "double", 150.0, true);
        Room room3 = new Room("103", "suite", 200.0, true);

        rooms.put(room1.getRoomNumber(), room1);
        rooms.put(room2.getRoomNumber(), room2);
        rooms.put(room3.getRoomNumber(), room3);
    }

    public static Map<String, Room> getRooms() {
        return rooms;
    }

    public static void reserveRoom(String roomNumber) {

            Room room = rooms.get(roomNumber);
            if (room != null && room.isAvailable()) {
                room.setAvailable(false);
                System.out.println("Room " + roomNumber + " reserved.");
            } else {
                System.out.println("Room " + roomNumber + " not available for reservation.");
            }

    }

    public static void releaseRoom(String roomNumber) {

            Room room = rooms.get(roomNumber);
            if (room != null && !room.isAvailable()) {
                room.setAvailable(true);
                System.out.println("Room " + roomNumber + " released.");
            } else {
                System.out.println("Room " + roomNumber + " not occupied or not found.");
            }

    }
}