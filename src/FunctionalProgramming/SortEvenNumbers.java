package FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> integers = Arrays.stream(scan.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> evenIntegers = integers.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        Function<List<Integer>,String> format = l -> l.stream().map(String::valueOf).collect(Collectors.joining(", "));

        System.out.println(format.apply(evenIntegers));

        Collections.sort(evenIntegers);
        System.out.println(format.apply(evenIntegers));


    }
}
