package fundamentals.Arrays_exam;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int index = 0;
        boolean isValid = false;
        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i = 0;i<arr.length;i++){
            int leftSum = 0;
            int rightSum = 0;
            for(int left = 0;left<i;left++){
                leftSum+=arr[left];
            }
            for(int right = i+1;right<=arr.length-1;right++){
                rightSum+=arr[right];
            }
            if(rightSum == leftSum){
                index = i;
                isValid = true;
            }
        }
        if(isValid){
            System.out.println(index);
        }
        else {
            System.out.println("no");
        }
    }
}
