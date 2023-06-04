package basics.FirstStepsInProgrammingJava;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int area_of_rectangle = a*b;
        System.out.println(area_of_rectangle);
    }
}
