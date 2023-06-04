package basics.ForLoop_exam;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i =0;i<n;i++)
        {
            int x =Integer.parseInt(scan.nextLine());
            if(x>max)
            {
                max = x;
            }
            sum+=x;
        }
        sum-=max;
        if(sum==max){
            System.out.printf("Yes \nSum = %d",sum);
        }
        else{
            System.out.printf("No \nDiff = %d",Math.abs(sum-max));
        }
    }
}
