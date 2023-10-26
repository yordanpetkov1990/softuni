package advanced.FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Function<Integer[],Integer> findMin = arr -> {

            return Arrays.stream(arr).min((e1,e2) -> Integer.compare(e1,e2)).get();
        };
        Integer[] integers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).toArray(Integer[]::new);
        System.out.println(findMin.apply(integers));
    }
}
