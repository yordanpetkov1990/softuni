package basics.WhileLoop;

import java.util.Scanner;

public class Sequence_2k_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int number = 1 ;
        while(n>=number)
        {
            System.out.println(number);
            number = number * 2 + 1;
        }

    }
}
