package fundamentals.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arr = scan.nextLine().split(" ");
//        for(int i= arr.length-1;i>=0;i--){
//            System.out.print(arr[i] + " ");
//        }
        for(int i = 0;i<arr.length/2;i++){
            String currentElement = arr[i];
            String targetElement =  arr[arr.length-1-i];
            arr[arr.length-1-i] = currentElement;
            arr[i] = targetElement;
        }
        System.out.println(Arrays.toString(arr).replace("[","").replace("]","").replace(",",""));
    }
}
