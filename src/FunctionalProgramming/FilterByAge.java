package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterByAge {
    static class Person{
        public String name;
        public Integer age;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split(", ");
            Person person = new Person();
            String name = tokens[0];
            Integer age = Integer.parseInt(tokens[1]);
            person.name =name;
            person.age= age;
            personList.add(person);
        }
        String condition = scan.nextLine();
        Integer ageCondition = Integer.parseInt(scan.nextLine());
        String format = scan.nextLine();

        Predicate<Person> personPredicate = createFilter(condition,ageCondition);
        Consumer<Person> printer = createPrinter(format);
        personList.stream().filter(personPredicate).forEach(printer);
    }

    private static Consumer<Person> createPrinter(String format) {
        if(format.equals("name")){
            return person -> System.out.println(person.name);
        }else if(format.equals("age")){
            return person -> System.out.println(person.age);
        }
        return person -> System.out.println(person.name + " - " +person.age);
    }

    private static Predicate<Person> createFilter(String condition, Integer ageCondition) {
        if(condition.equals("younger")){
            return person -> person.age <=ageCondition;
        }
        return person -> person.age >= ageCondition;
    }
}
