package advanced.MultiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] dimensions = scan.nextLine().split(", ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
        int[][] matrix = new int[rows][cols];
        int sum = 0;
        for (int i = 0; i <rows ; i++) {
            int[] inputRow = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = inputRow;
            sum+= Arrays.stream(inputRow).sum();
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);

    }
}
