package fundamentals.Methods_exam;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());
        smallestNumber(num1,num2,num3);
    }
    public static void smallestNumber(int a,int b,int c){
        if( a < b && a < c){
            System.out.println(a);
        }
        else if(b < a && b < c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}
