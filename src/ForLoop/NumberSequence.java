package ForLoop;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++)
        {
            int x =Integer.parseInt(scan.nextLine());
            if(x > max)
            {
                max = x;
            }
            if(x < min)
            {
                min = x;
            }
        }
        System.out.printf("Max number: %d\n",max);
        System.out.printf("Min number: %d",min);
    }
}
