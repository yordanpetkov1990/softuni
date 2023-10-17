package advanced.MultiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix1 = createMatrix(scanner);
        int[][] matrix2 = createMatrix(scanner);
        boolean b = compareMatrix(matrix1, matrix2);
        if(b){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }

    private static boolean compareMatrix(int[][] matrix1, int[][] matrix2) {
        if(matrix1.length != matrix2.length ){
            return false;
        }
        for (int i = 0; i <matrix1.length ; i++) {
            if(matrix1[i].length != matrix2[i].length){
                return false;
            }
            for (int j = 0; j < matrix1[i].length; j++) {
                if(matrix1[i][j] != matrix2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    private static int[][] createMatrix(Scanner scanner) {
        String[] tokens = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(tokens[0]);
        int cols = Integer.parseInt(tokens[1]);
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            arr[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }


        return arr;
    }

}
