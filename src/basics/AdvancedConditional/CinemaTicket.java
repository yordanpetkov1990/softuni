package basics.AdvancedConditional;

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String day = scan.nextLine();
        if(day.equals("Monday") || day.equals("Tuesday")){
            System.out.println("12");
        }
        else if(day.equals("Wednesday") || day.equals("Thursday")){
            System.out.println("14");
        }
        else if(day.equals("Friday")){
            System.out.println("12");
        }
        else if(day.equals("Saturday") || day.equals("Sunday")){
            System.out.println("16");
        }
    }
}
