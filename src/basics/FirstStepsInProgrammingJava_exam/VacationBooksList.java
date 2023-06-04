package basics.FirstStepsInProgrammingJava_exam;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pages = Integer.parseInt(scan.nextLine());
        int pages_per_hour = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());
        int hours_per_day = pages /pages_per_hour /days;
        System.out.printf("%d",hours_per_day);
    }
}
