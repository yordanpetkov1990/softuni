package advanced.MultiDimensionalArrays;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        char[][] matrix1 = new char[n][m];
        char[][] matrix2 = new char[n][m];
        for (int i = 0; i < n; i++) {
            matrix1[i] = scan.nextLine().replace(" ","").toCharArray();
        }
        for (int i = 0; i < n; i++) {
            matrix2[i] = scan.nextLine().replace(" ","").toCharArray();
        }
        char[][] result = new char[n][m];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix1[i][j] == matrix2[i][j]){
                    result[i][j] = matrix1[i][j];
                }else{
                    result[i][j] = '*';
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j <result[i].length ; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

}
