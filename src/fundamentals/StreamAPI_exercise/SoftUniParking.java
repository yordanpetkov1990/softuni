package fundamentals.StreamAPI_exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        LinkedHashMap<String,String> users = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] commandParts = scan.nextLine().split(" ");
            String commandName = commandParts[0];
            String username = commandParts[1];
            switch (commandName){
                case "register":
                    String licensePlateNumber = commandParts[2];
                    if(users.containsKey(username)){
                        System.out.println("ERROR: already registered with plate number " +users.get(username) );
                    }
                    else{
                        System.out.println(username + " registered " +licensePlateNumber + " successfully");
                        users.put(username,licensePlateNumber);
                    }
                    break;
                case "unregister":
                    if(!users.containsKey(username)){
                        System.out.println("ERROR: user" + " " + username + " " + "not found");
                    }
                    else{
                        users.remove(username);
                        System.out.println(username + " unregistered successfully");
                    }
                    break;
            }
        }
        for(Map.Entry<String,String> entry : users.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
