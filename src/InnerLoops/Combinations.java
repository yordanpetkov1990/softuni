package InnerLoops;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int count = 0;


        for(int i=0;i<=n;i++)
        {
            for(int y = 0;y<=n;y++)
            {
                for(int k = 0;k<=n;k++)
                {
                    if(i+y+k == n)
                    {
                        count++;
                    }
                }
            }
        }
        System.out.printf("%d",count);
    }
}
