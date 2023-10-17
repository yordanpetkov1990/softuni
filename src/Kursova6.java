


import java.util.*;


public class Kursova6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] countArr = new int[arr.length];
        int count = 1;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    count++;
                    countArr[i] = count;
                }else{
                    break;
                }
            }
            count = 1;

        }
        int maxCount = Integer.MIN_VALUE;
        int startIndex = -1;
        for (int i = 0; i < countArr.length; i++) {
            if(countArr[i] > maxCount){
                maxCount = countArr[i];
                startIndex= i;
            }
        }
        int iterationCount = 0;
        for (int i = startIndex; i < arr.length; i++) {
            if(iterationCount == maxCount){
                break;
            }
            System.out.print(arr[i] + " ");
            iterationCount++;
        }
    }
}
