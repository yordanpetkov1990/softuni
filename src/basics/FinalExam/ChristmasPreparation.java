package basics.FinalExam;

import java.util.Scanner;

public class ChristmasPreparation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int rolki_count_hartiq = Integer.parseInt(scan.nextLine());
        int rolki_count_plat = Integer.parseInt(scan.nextLine());
        double liters_lepilo = Double.parseDouble(scan.nextLine());
        int discount = Integer.parseInt(scan.nextLine());

        double sum = rolki_count_hartiq * 5.80 + rolki_count_plat * 7.20 + liters_lepilo * 1.20;
        sum = sum - (sum *discount * 1.0/100);
        System.out.printf("%.3f",sum);

    }
}
