package FirstStepsInProgrammingJava;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int dogs = Integer.parseInt(scan.nextLine());
        int cats = Integer.parseInt(scan.nextLine());
        double sum = dogs * 2.50 + cats * 4;
        System.out.println(sum + " lv.");
    }
}
