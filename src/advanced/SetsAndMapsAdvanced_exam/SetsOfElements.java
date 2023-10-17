package advanced.SetsAndMapsAdvanced_exam;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Integer> integerSet1 = new LinkedHashSet<>();
        Set<Integer> integerSet2 = new LinkedHashSet<>();
        Set<Integer> integerSet3 = new LinkedHashSet<>();

        int[] tokens = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < tokens[0]; i++) {
            integerSet1.add(Integer.parseInt(scan.nextLine()));
        }
        for (int i = 0; i < tokens[1]; i++) {
            integerSet2.add(Integer.parseInt(scan.nextLine()));
        }


         integerSet1.retainAll(integerSet2);
        String join = String.join(" ", integerSet1.toString().replace("[", "").replace("]", "").replace(",",""));
        System.out.println(join);

    }
}
