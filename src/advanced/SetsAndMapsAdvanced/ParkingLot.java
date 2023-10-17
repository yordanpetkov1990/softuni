package advanced.SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        Set<String> stringSet = new LinkedHashSet<>();
        while(!"END".equals(command)){
            String[] tokens = command.split(", ");
            String direction = tokens[0];
            String number = tokens[1];
            if(direction.equals("IN")){
                stringSet.add(number);
            }else if(direction.equals("OUT")){
                stringSet.remove(number);
            }


            command = scan.nextLine();
        }
        if(stringSet.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }
        else{
            for (String s : stringSet) {
                System.out.println(s);
            }
        }

    }
}
