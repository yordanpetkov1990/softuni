package advanced.SetsAndMapsAdvanced_exam;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Set<String> stringSet = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String[] elements = scan.nextLine().split(" ");
            stringSet.addAll(Arrays.asList(elements));

        }
        String join = String.join(" ", stringSet);
        System.out.println(join);
    }
}
