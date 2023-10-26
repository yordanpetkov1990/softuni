package advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        Predicate<String> checkUppercase = s -> Character.isUpperCase(s.charAt(0));
        System.out.println(Arrays.stream(line.split(" ")).filter(checkUppercase).count());
        Arrays.stream(line.split(" ")).filter(checkUppercase).forEach(System.out::println);
    }
}
