package ObjectAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    String firstName;
    String lastName;
    String age;
    String homeTown;
    public Students(String firstName,String lastName,String age,String homeTown){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.homeTown = homeTown;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        List<Students> students = new ArrayList<>();
        while(!command.equals("end")){
            String[] commandParts = command.split(" ");
            String firstName = commandParts[0];
            String lastName = commandParts[1];
            String age = commandParts[2];
            String homeTown = commandParts[3];
            boolean isFound = true;
            Students currentStudent = new Students(firstName,lastName,age,homeTown);
            for(Students student:students){
                if(student.firstName.equals(firstName) && student.lastName.equals(lastName)){
                    student.age = age;
                    student.homeTown = homeTown;
                    isFound=false;
                }
            }
            if(isFound){
                students.add(currentStudent);
            }


            command = scan.nextLine();
        }
        String city = scan.nextLine();
        for(Students student : students){
            if(student.homeTown.equals(city)){
                System.out.printf("%s %s is %s years old\n",student.firstName,student.lastName,student.age);
            }
        }
    }
}
