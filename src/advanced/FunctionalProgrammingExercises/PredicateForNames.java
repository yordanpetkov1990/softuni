package advanced.FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Predicate<String> stringPredicate = s -> s.length() <= n;
        Arrays.stream(scan.nextLine().split("\\s+")).filter(stringPredicate).forEach(System.out::println);
    }
}
