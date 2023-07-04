package fundamentals.Methods;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        int number1 = Integer.parseInt(scan.nextLine());
        int number2 = Integer.parseInt(scan.nextLine());
        switch (command){
            case "add":
                addition(number1,number2);
                break;
            case "subtract":
                subtract(number1,number2);
                break;
            case "multiply":
                multiply(number1,number2);
                break;
            case "divide":
                divide(number1,number2);
                break;
        }


    }
    public static void addition(int number1,int number2){
        System.out.println(number1+number2);
    }
    public static void subtract(int number1,int number2){
        System.out.println(number1-number2);
    }
    public static void multiply(int number1,int number2){
        System.out.println(number1*number2);
    }
    public static void divide(int number1,int number2){
        System.out.println(number1/number2);
    }

}
