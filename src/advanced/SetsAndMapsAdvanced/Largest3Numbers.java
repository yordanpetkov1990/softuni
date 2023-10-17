package advanced.SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.Scanner;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).sorted((e1,e2) -> Integer.compare(e2,e1)).limit(3).forEach(e -> System.out.print(e + " "));
    }
}
