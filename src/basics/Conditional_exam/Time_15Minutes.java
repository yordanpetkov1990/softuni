package basics.Conditional_exam;

import java.util.Scanner;

public class Time_15Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());
        int totalMinutes = hours * 60 + minutes + 15;
        hours = totalMinutes / 60;
        minutes = totalMinutes % 60;
        if(hours > 23){
            hours = 0;
        }
        if(minutes < 10)
        {
            System.out.printf("%d:0%d",hours,minutes);

        }
        else{
            System.out.printf("%d:%d",hours,minutes);
        }

    }
}
