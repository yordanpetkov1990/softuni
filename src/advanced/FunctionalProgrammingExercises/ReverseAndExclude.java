package advanced.FunctionalProgrammingExercises;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> integers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int n = Integer.parseInt(scan.nextLine());
        Predicate<Integer> checkDivisible = integer -> {
            return integer % n != 0;
        };
        List<Integer> integers1 = integers.stream().filter(checkDivisible).collect(Collectors.toList());
        Collections.reverse(integers1);

        integers1.stream().forEach(integer -> System.out.print(integer + " "));
    }
}
