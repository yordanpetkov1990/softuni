package Test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());


        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = n-i; j <=n ; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = n-1; i > 0 ; i--) {
            for (int j = n; j > i ; j--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0 ; j--) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}
