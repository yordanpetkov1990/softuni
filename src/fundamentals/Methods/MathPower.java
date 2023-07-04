package fundamentals.Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());
        int pow = Integer.parseInt(scan.nextLine());
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(power(number,pow)));


    }
    public static double power(double number, int power){
        double result= 1;
        for(int i= 0;i<power;i++){
            result*=number;
        }
        return result;
    }
}
