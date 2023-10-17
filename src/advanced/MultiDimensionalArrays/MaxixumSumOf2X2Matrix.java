package advanced.MultiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxixumSumOf2X2Matrix {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] dimensions = scan.nextLine().split(", ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i <rows ; i++) {
            int[] inputRow = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = inputRow;
        }
        int[][] maxMatrix = new int[2][2];
        int maxSum = Integer.MIN_VALUE;


        for (int i = 0; i <matrix.length-1 ; i++) {
            for (int j = 0; j < matrix[i].length-1; j++) {

                int currentElement = matrix[i][j];
                int right = matrix[i][j+1];
                int down = matrix[i+1][j];
                int downleft = matrix[i+1][j+1];
                int currentSum = currentElement+right+downleft+down;

                if(currentSum > maxSum){
                    maxSum = currentSum;
                    maxMatrix[0][0] = currentElement;
                    maxMatrix[0][1] = right;
                    maxMatrix[1][0] = down;
                    maxMatrix[1][1] = downleft;
                }

            }
        }

        System.out.println(maxMatrix[0][0] + " " + maxMatrix[0][1]);
        System.out.println(maxMatrix[1][0] + " " +  maxMatrix[1][1]);
        System.out.println(maxSum);
    }
}
