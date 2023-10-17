package advanced.MultiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = Integer.parseInt(scan.nextLine());
        int[][] matrix = new int[rows][];
        int cols = 1;
        for (int i = 0; i < rows; i++) {
            int[] rows2 = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = rows2;
            cols=rows2.length;
        }
        int[] tokens = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        int wrongMeasure = matrix[tokens[0]][tokens[1]];

        int[][] originalMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                originalMatrix[i][j] = matrix[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int currentElement = matrix[i][j];
                if(currentElement == wrongMeasure){
                    int sumOfNearestElements = sumOfNearestElements(i, j, originalMatrix,wrongMeasure);
                    matrix[i][j] = sumOfNearestElements;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static int sumOfNearestElements(int i, int j,int[][] originalMatrix,int wrong) {
        int sum = 0;

        int up = 0;
        int down = 0;
        int left = 0;
        int right = 0;
        if(i -1 >=0){
            if(originalMatrix[i-1][j] !=wrong) {
                sum += originalMatrix[i - 1][j];
            }
        }
        if(i+1<originalMatrix.length){
            if(originalMatrix[i+1][j] !=wrong) {
                sum += originalMatrix[i + 1][j];
            }
        }
        if(j-1 >= 0){
            if(originalMatrix[i][j-1] !=wrong) {
                sum += originalMatrix[i][j-1];
            }
        }
        if(j+1<originalMatrix[i].length){
            if(originalMatrix[i][j+1] !=wrong) {
                sum += originalMatrix[i][j+1];
            }
        }

        return sum;
    }
}
