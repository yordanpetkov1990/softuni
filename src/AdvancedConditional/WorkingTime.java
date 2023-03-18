package AdvancedConditional;

import java.util.Scanner;

public class WorkingTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int time = Integer.parseInt(scan.nextLine());
        String day = scan.nextLine();
        if(day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday") || day.equals("Saturday")){
            if(time<=18 && time >= 10){
                System.out.println("open");
            }
            else{
                System.out.println("closed");
            }
        }
        else {
            System.out.println("closed");
        }

    }
}
