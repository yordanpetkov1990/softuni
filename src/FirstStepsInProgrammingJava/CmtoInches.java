package FirstStepsInProgrammingJava;

import java.util.Scanner;

public class CmtoInches {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double inches = scan.nextDouble();
        double cm = inches * 2.54;
        System.out.println(cm);

    }
}
