package advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int decimal = Integer.parseInt(scan.nextLine());
        ArrayDeque<Integer> binary = new ArrayDeque<>();
        if(decimal == 0){
            System.out.println("0");
            return;
        }
        while(decimal > 0){
            int remainder = decimal % 2;
            decimal/=2;
            binary.push(remainder);
        }
        for (Integer x:
             binary) {
            System.out.print(x);
        }
    }
}
