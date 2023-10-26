package advanced.FunctionalProgramming;


import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FindEvenOrOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] tokens = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int start = tokens[0];
        int end = tokens[1];
        String condition =scan.nextLine();
        if(condition.equals("odd")){
            printRange(start,end,i -> i % 2 != 0);
        }else if(condition.equals("even")){
            printRange(start,end,i -> i % 2 == 0);
        }

    }

    private static void printRange(int start, int end, IntPredicate filter) {
        IntStream.rangeClosed(start,end).filter(filter).forEach(e -> System.out.print(e + " "));
    }
}

