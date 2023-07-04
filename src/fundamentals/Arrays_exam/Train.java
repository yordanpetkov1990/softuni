package fundamentals.Arrays_exam;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] arr = new int[n];
        int sum = 0;
        for(int i =0;i<n;i++){
            int people = Integer.parseInt(scan.nextLine());
            arr[i] = people;
            sum+=people;
        }
        for(int e: arr){
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
