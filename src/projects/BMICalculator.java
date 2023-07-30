package projects;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int number = printIntroduction(scan);
        double bmi = getBMI(scan);
        String status = getStatus(bmi);
        reportResult(number,bmi,status);
    }
    public static int printIntroduction(Scanner scan){
        int number = Integer.parseInt(scan.nextLine());
        System.out.println("Hello, " + number);
        return number;
    }
    public static double getBMI(Scanner scan){
        double inch = Double.parseDouble(scan.nextLine());
        double pounds = Double.parseDouble(scan.nextLine());
        return bmiFor(inch,pounds);

    }
    public static double bmiFor(double inch,double pounds){
        double kilograms = pounds / 2.2046;
        double m =(inch * 2.57)/100;
        double bodyMassIndex = kilograms /(m*m);
        return bodyMassIndex;
    }
    public static String getStatus(double bodyMassIndex){
        String result = "";
        if(bodyMassIndex <18.5){
            result = "underweight";
        }
        else if(bodyMassIndex<25){
            result = "normal";
        }
        else if(bodyMassIndex<30){
            result = "overweight";
        }
        else{
            result = "obese";
        }
        return result;
    }
    public static void reportResult(int num,double bodyMassIndex,String status){
        System.out.printf("%d have BMI=%.2f and is with status %s",num,bodyMassIndex,status);
    }
}
