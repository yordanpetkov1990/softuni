package fundamentals.Arrays_exam;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = Integer.parseInt(scan.nextLine());
        for(int i =0;i<arr.length;i++){
            for(int y = i + 1;y<arr.length;y++){
                if(arr[i] + arr[y] == sum){
                    System.out.printf(arr[i] + " " + arr[y]+"\n");
                }
            }
        }
    }
}
