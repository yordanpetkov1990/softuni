package fundamentals.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while(arr.length > 1){
            int[] resultArr = new int[arr.length-1];
            for(int i = 0;i<resultArr.length;i++){
                resultArr[i] = arr[i] + arr[i+1];
            }

            arr = resultArr;

        }
        System.out.println(Arrays.toString(arr).replace("[","").replace("]",""));
    }
}
