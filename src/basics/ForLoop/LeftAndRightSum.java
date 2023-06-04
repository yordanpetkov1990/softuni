package basics.ForLoop;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum1 = 0;
        int sum2 =0;
        for(int i = 0;i<n*2;i++)
        {
            int x = Integer.parseInt(scan.nextLine());
           if(i<n){
               sum1+=x;
           }
           else{
               sum2+=x;
           }
        }
        if(sum1==sum2){
            System.out.printf("Yes, sum = %d",sum1);
        }
        else{
            System.out.printf("No, diff = %d",Math.abs(sum1-sum2));
        }
    }
}
