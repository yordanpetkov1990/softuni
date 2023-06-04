package basics.Conditional_exam;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double trip =Double.parseDouble(scan.nextLine());

        int puzzels = Integer.parseInt(scan.nextLine());
        int dolls = Integer.parseInt(scan.nextLine());
        int bears = Integer.parseInt(scan.nextLine());
        int minions = Integer.parseInt(scan.nextLine());
        int trucks = Integer.parseInt(scan.nextLine());

        int total_count = puzzels+dolls+bears+minions+trucks;
        double totalSum =puzzels*2.60 + dolls * 3 + bears *4.10 +minions * 8.20 + trucks * 2;
        if(total_count >= 50){
            totalSum-=totalSum*0.25;
        }
        totalSum-=totalSum*0.10;
        if (trip <= totalSum)
        {
            System.out.printf("Yes! %.2f lv left.",Math.abs(trip - totalSum));
        }
        else {
            System.out.printf("Not enough money! %.2f lv needed.",Math.abs(trip-totalSum));
        }


    }
}
