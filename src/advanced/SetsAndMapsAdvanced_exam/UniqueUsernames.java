package advanced.SetsAndMapsAdvanced_exam;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        Set<String> stringSet = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            stringSet.add(scan.nextLine());
        }
        for (String s : stringSet) {
            System.out.println(s);
        }
    }
}
