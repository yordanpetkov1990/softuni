package FirstStepsInProgrammingJava_exam;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double deposited_sum = Double.parseDouble(scan.nextLine());
        int months = Integer.parseInt(scan.nextLine());
        double lihva = Double.parseDouble(scan.nextLine());
        double final_sum = deposited_sum + months *((deposited_sum * (lihva/100)) / 12);
        System.out.printf("%f",final_sum);
    }
}
