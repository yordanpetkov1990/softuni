package fundamentals.List_exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<String> guestList = new ArrayList<>();
        for(int i = 0;i<n;i++){
            String input = scan.nextLine();
            String[] commandParts = input.split(" ");
            String guest = commandParts[0];
            if(!input.contains("not")){
                if(!guestList.contains(guest)){
                    guestList.add(guest);
                }
                else{
                    System.out.println(guest + " is already in the list!");
                }
            }else{
                if(!guestList.contains(guest)){
                    System.out.println(guest + " is not in the list!");
                }
                else{
                    guestList.remove(guest);
                }
            }


        }
        for(String e :guestList){
            System.out.println(e);
        }
    }
}
