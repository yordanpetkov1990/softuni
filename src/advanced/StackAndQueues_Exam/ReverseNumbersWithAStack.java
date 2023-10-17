package advanced.StackAndQueues_Exam;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .forEach(stack::push);
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
