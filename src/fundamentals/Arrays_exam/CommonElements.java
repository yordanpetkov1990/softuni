package fundamentals.Arrays_exam;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr1 = scan.nextLine().split(" ");
        String[] arr2 = scan.nextLine().split(" ");
        for(int i = 0;i<arr2.length;i++){
            for(int y = 0;y<arr1.length;y++){
                if(arr2[i].equals(arr1[y])) {
                    System.out.print(arr2[i]+" ");
                }
            }
        }
    }
}
