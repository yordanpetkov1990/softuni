package fundamentals.Methods_exam;

import java.util.Scanner;

public class NxN_Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        printMatrix(n);
    }
    public static void printMatrix(int n){
        for(int i =0;i<n;i++){
            for(int y = 0;y<n;y++){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
