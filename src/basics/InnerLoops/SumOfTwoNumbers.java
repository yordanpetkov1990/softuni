package basics.InnerLoops;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x1 = Integer.parseInt(scan.nextLine());
        int x2 = Integer.parseInt(scan.nextLine());
        int x3 = Integer.parseInt(scan.nextLine());

        int count = 0;
        boolean flag = false;

        for(int i = x1;i<=x2;i++){
            for(int y =x1;y<=x2;y++)
            {
                count++;
                int sum = i+y;
                if(sum == x3){
                    flag=true;
                    System.out.printf("Combination N:%d (%d + %d = %d)",count,i,y,x3);
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        if(flag == false){
            System.out.printf("%d combinations - neither equals %d",count,x3);
        }


    }
}
