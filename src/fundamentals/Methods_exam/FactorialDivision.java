package fundamentals.Methods_exam;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        double result = factorial(num1) / factorial(num2);
        System.out.printf("%.2f",result);
    }
    public static double factorial(int a){
        double fact = 1;
        for(int i =1;i<=a;i++){
            fact*=i;
        }
        return fact;
    }
}
