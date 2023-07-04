package BasicSyntax_MoreExercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num1 = Double.parseDouble(scan.nextLine());
        double num2 = Double.parseDouble(scan.nextLine());
        double num3 = Double.parseDouble(scan.nextLine());
        DecimalFormat df = new DecimalFormat("0.##");
        df.format(num1);
        df.format(num2);
 ;

       if(num1 > num2 && num1 > num3){
           System.out.println(df.format(num1));
           if(num2 >= num3){
               System.out.println( df.format(num2));
               System.out.println(df.format(num3));
           }
           else if(num3 >= num2){
               System.out.println(df.format(num3));
               System.out.println( df.format(num2));
           }

       }else if(num2 > num1 && num2 > num3){
           System.out.println( df.format(num2));
           if(num1 >= num3){
               System.out.println( df.format(num1));
               System.out.println(df.format(num3));
           }
           else if(num3 >= num1){
               System.out.println(df.format(num3));
               System.out.println( df.format(num1));
           }
       }
       else{
           System.out.println(df.format(num3));
           if(num1 >= num2){
               System.out.println( df.format(num1));
               System.out.println( df.format(num2));
           }
           else if(num2 >= num1){
               System.out.println( df.format(num2));
               System.out.println( df.format(num1));
           }
       }


    }
}
