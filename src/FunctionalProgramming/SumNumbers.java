package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] ints = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        Function<int[],Integer> count = arr -> arr.length;
        Function<int[],Integer> sum = arr -> Arrays.stream(arr).sum();

        System.out.println("Count = " + count.apply(ints));
        System.out.println("Sum = " + sum.apply(ints));

    }
}
