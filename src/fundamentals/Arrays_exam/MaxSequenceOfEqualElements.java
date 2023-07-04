package fundamentals.Arrays_exam;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] countArr = new int[arr.length];
        int count = 1;
        for(int i = 0;i< arr.length;i++){
            for(int y = i + 1;y<arr.length;y++){
                if(arr[i] == arr[y]){
                    count++;
                    countArr[i] = count;
                }
                else{
                    count = 1;
                    break;
                }
            }
            count = 1;
        }
        int maxcount = Integer.MIN_VALUE;
        int startIndex = -1;

        for(int i =0;i<=countArr.length-1;i++){
            if(countArr[i] > maxcount){
                maxcount = countArr[i];
                startIndex = i;
            }
        }
        int iterationCount = 0;
        for(int i = startIndex;i<arr.length;i++){
            if(iterationCount == maxcount){
                break;
            }
            System.out.print(arr[i] + " ");
            iterationCount++;
        }
    }
}
