package advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        String[] tokens = scan.nextLine().split("\\s+");
        Collections.addAll(stack,tokens);
        while(stack.size()> 1){
            int x = Integer.parseInt(stack.pop());
            String operator = String.valueOf(stack.pop());
            int z = Integer.parseInt(stack.pop());
            int newNumber = -1;
            switch (operator){
                case"+":
                    newNumber=x+z;
                    break;
                case"-":
                    newNumber=x-z;
                    break;
            }
            stack.push(String.valueOf(newNumber));
        }
        System.out.println(stack.pop());
    }
}
