package fundamentals.Arrays;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            int x = Integer.parseInt(scan.nextLine());
            arr[i] = x;
        }
        for(int i = arr.length - 1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
