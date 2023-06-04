package basics.Conditional_exam;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String serial = scan.nextLine();
        int durability_episode = Integer.parseInt(scan.nextLine());
        double durability_rest = Double.parseDouble(scan.nextLine());

        double lunch_time =  durability_rest/ 8;
        double rest = durability_rest / 4;

        durability_rest = durability_rest - (lunch_time+rest);

        if(durability_rest>=durability_episode){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",serial,Math.ceil(durability_rest-durability_episode));
        }
        else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",serial,Math.ceil(durability_episode-durability_rest));
        }
    }
}
