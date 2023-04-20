package ForLoop;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum_even = 0;
        int sum_odd = 0;
        for(int i =0;i<n;i++)
        {
            int x = Integer.parseInt(scan.nextLine());
            if(i%2==0){
                sum_even+=x;
            }
            else{
                sum_odd+=x;
            }
        }
        if(sum_odd==sum_even){
            System.out.println("Yes");
            System.out.printf("Sum = %d",sum_even);
        }
        else{
            System.out.println("No");
            System.out.printf("Diff = %d",Math.abs(sum_even-sum_odd));
        }
    }
}
