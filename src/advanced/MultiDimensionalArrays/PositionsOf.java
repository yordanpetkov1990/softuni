package advanced.MultiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = createMatrix(scan);
        int n = Integer.parseInt(scan.nextLine());
        boolean isFound = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                if(matrix[i][j] == n){
                    isFound=true;
                    System.out.println(i + " " + j);
                }
            }
        }
        if(!isFound){
            System.out.println("not found");
        }

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
