package fundamentals.Arrays;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        String[] array = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        if(n <= 0 || n > 7){
            System.out.println("Invalid day!");
        }
        else{
            System.out.println(array[n-1]);
        }


    }
}
