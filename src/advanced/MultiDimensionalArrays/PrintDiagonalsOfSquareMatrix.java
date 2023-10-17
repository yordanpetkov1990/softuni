package advanced.MultiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i] = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
        for (int i = n-1; i >=0 ; i--) {
            System.out.print(matrix[i][n-i-1] + " ");
        }
    }
}
