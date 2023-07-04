package fundamentals.Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        String operator=scan.nextLine();
        int b = Integer.parseInt(scan.nextLine());
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(calculator(a,operator,b)));


    }
    public static double calculator(int a,String operator,int b){
        switch (operator){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a * 1.0 / b;

        }
        return 0;
    }
}
