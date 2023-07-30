package fundamentals.ObjectAndClasses_exam;

import java.util.*;

public class OrderByAge {
    static class Person{
        private String name;
        private String id;
        private int age;
        public Person(String name,String id,int age){
            this.name = name;
            this.id=id;
            this.age=age;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            // tephan with ID: 524244 is 10 years old.
            return this.name + " with ID: " + this.id + " is " + this.age + " years old.";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        List<Person> persons = new ArrayList<>();
        while(!command.equals("End")){
            String[] commandParts = command.split(" ");
            Person currentPerson = new Person(commandParts[0],commandParts[1],Integer.parseInt(commandParts[2]));
            persons.add(currentPerson);
            command = scan.nextLine();
        }
        Collections.sort(persons, Comparator.comparing(Person::getAge));
        for(Person person:persons){
            System.out.println(person.toString());
        }

    }
}
