package fundamentals.Methods_exam;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        System.out.println(substract(a,b,c));

    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int substract(int a ,int b,int c){
        return sum(a,b) - c;
    }
}
