package fundamentals.Arrays_exam;

import java.util.Scanner;

public class Zig_ZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int count = 1;
        for(int i = 0;i<n;i++){
            String[] commandParts = scan.nextLine().split(" ");
            int number1 = Integer.parseInt(commandParts[0]);
            int number2 = Integer.parseInt(commandParts[1]);
            if(count % 2 == 0){
                arr1[i] = number2;
                arr2[i] = number1;
            }
            else{
                arr1[i] = number1;
                arr2[i] = number2;
            }
            count++;


        }
        for(int e:arr1){
            System.out.print(e + " ");
        }
        System.out.println();
        for(int e:arr2){
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
