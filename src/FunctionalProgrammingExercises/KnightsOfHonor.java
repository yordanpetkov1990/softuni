package FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Consumer<String> printToConsole = s -> System.out.println("Sir " + s);
        Arrays.stream(scan.nextLine().split("\\s+")).forEach(printToConsole);
    }
}
