package FirstStepsInProgrammingJava;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double metri = Double.parseDouble(scan.nextLine());
        double final_sum = metri * 7.61;
        double discount = final_sum * 0.18;
        final_sum = final_sum- discount;
        System.out.println("The final price is: " + final_sum + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
