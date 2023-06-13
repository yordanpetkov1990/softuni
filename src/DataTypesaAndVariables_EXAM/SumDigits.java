package DataTypesaAndVariables_EXAM;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine());
        int sum = 0;
        while(N>0){
        sum+=N%10;
        N/=10;
        }
        System.out.println(sum);
    }
}
