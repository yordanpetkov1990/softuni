package fundamentals.ObjectAndClasses_exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Opinion_Poll {
    static class Person{
        private String name;
        private int age;
        public Person(String name,int age){
            this.name = name;
            this.age = age;

        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Person> validPeople = new ArrayList<>();
        for(int i = 0;i<n;i++){
            String[] commandParts = scan.nextLine().split(" ");
            Person currentPerson = new Person(commandParts[0],Integer.parseInt(commandParts[1]));
            if(currentPerson.getAge() > 30){
                validPeople.add(currentPerson);
            }

        }
        for(Person person:validPeople){
            System.out.printf("%s - %d\n",person.getName(),person.getAge());
        }

    }
}
