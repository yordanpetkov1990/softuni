package advanced.FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Function<List<Integer>,Integer> findMin = l -> {
            int minIndex = -1;
            int index = 0;
            Integer min = Integer.MAX_VALUE;
            for (Integer integer : l) {
                if(integer <= min){
                    minIndex = index;
                    min = integer;
                }
                index++;
            }
            return minIndex;
        };
        List<Integer> integers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(findMin.apply(integers));
    }
}
