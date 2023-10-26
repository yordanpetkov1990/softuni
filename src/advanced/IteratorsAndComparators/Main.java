package advanced.IteratorsAndComparators;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n  = Integer.parseInt(scan.nextLine());

        TreeSet<Person> set1 = new TreeSet<>(new CustomPersonComparator1());
        TreeSet<Person> set2 = new TreeSet<>(new CustomPersonComparator2());
        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            Person person = new Person(name,age);
            set1.add(person);
            set2.add(person);
        }
        set1.forEach(System.out::println);

        set2.forEach(System.out::println);
    }
}
