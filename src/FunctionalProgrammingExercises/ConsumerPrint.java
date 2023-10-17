package FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Consumer<String> printToConsole = System.out::println;
        Arrays.stream(scan.nextLine().split("\\s+")).forEach(printToConsole);
    }
}
