package fundamentals.Arrays_exam;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scan.nextLine());
        for(int i = 0 ;i<n;i++){
            int firstElement = arr[0];
            for(int y = 1;y< arr.length;y++){
                arr[y - 1] = arr[y];
            }
            arr[arr.length-1] = firstElement;
        }
        System.out.println(Arrays.toString(arr).replace("[","").replace("]","").replace(",",""));
    }
}
