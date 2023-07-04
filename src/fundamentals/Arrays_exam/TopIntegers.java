package fundamentals.Arrays_exam;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isValid = false;
        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i = 0;i<arr.length-1;i++){
            for(int y = i + 1;y<arr.length;y++){
                if(arr[i] > arr[y]){
                    isValid=true;
                }
                else{
                    isValid = false;
                    break;
                }
            }
            if(isValid){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println(arr[arr.length-1]);

    }
}
