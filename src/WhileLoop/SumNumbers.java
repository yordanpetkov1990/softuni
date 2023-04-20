package WhileLoop;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        while(n > sum){
            int x = Integer.parseInt(scan.nextLine());
            sum+=x;
        }
        System.out.printf("%d",sum);
    }
}
