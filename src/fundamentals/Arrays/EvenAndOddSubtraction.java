package fundamentals.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int evenSum = 0;
        int oddSum = 0;
        for(int i =0;i<= arr.length-1;i++){
            int currentElement = arr[i];
            if(currentElement % 2 == 0){
                evenSum+=currentElement;
            }
            else{
                oddSum+=currentElement;
            }
        }
        System.out.println(evenSum-oddSum);
    }
}
