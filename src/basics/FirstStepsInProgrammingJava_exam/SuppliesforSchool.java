package basics.FirstStepsInProgrammingJava_exam;

import java.util.Scanner;

public class SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int packets_pens = Integer.parseInt(scan.nextLine());
        int packets_marker = Integer.parseInt(scan.nextLine());
        int liters = Integer.parseInt(scan.nextLine());
        int discount = Integer.parseInt(scan.nextLine());
        double final_sum= (packets_pens * 5.8 + packets_marker * 7.2 + liters * 1.2);
        final_sum= final_sum -(final_sum * discount/100);
        System.out.printf("%f",final_sum);
    }
}
