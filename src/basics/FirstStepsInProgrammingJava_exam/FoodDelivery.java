package basics.FirstStepsInProgrammingJava_exam;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chicken = Integer.parseInt(scan.nextLine());
        int fish = Integer.parseInt(scan.nextLine());
        int vegetarian = Integer.parseInt(scan.nextLine());
        double final_sum = chicken * 10.35 + fish * 12.40 + vegetarian * 8.15;
        double desert = 0.2 * final_sum;
        final_sum+=desert + 2.50;
        System.out.printf("%f",final_sum);

    }
}
