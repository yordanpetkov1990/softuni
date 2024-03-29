package advanced.StackAndQueues_Exam;

import java.util.Scanner;

public class FibonaciSequance {
    private static long[] memory;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        memory = new long[n+1];
        System.out.println(fib(n));


    }
    private static long fib(int n) {
        if (n < 2) {
            return 1;
        }
        if (memory[n] != 0) {
            return memory[n];
        }

        memory[n] = fib(n - 1) + fib(n - 2);
        return memory[n];
    }
}
