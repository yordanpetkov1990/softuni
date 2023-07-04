package fundamentals.Methods;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        printTriangle(n);
    }

    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int y = 1; y <= i; y++) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        for (int i = n; i > 1; i--) {
            for (int y = 1; y < i; y++) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

    }
}
