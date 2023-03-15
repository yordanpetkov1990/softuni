package FirstStepsInProgrammingJava_exam;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double dolars = Double.parseDouble(scan.nextLine());
        double leva = dolars * 1.79549;
        System.out.printf("%f",leva);
    }
}
