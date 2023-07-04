package fundamentals.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr1 = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean isValid = true;
        int index = 0;
        int sum = 0;
        for(int i = 0;i<=arr1.length-1;i++){
            if(arr1[i] != arr2[i]){
                isValid=false;
                index = i;
                break;
            }
            sum+=arr1[i];
        }
        if(isValid){
            System.out.println("fundamentals.Arrays are identical. Sum: " + sum);
        }
        else{
            System.out.printf("fundamentals.Arrays are not identical. Found difference at %d index.\n",index);
        }
    }
}
