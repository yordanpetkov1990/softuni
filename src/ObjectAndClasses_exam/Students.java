package ObjectAndClasses_exam;

import java.util.*;

public class Students {
    private String firstName;
    private String lastName;
    private double grade;
    public Students(String firstname,String lastName,double grade){
        this.firstName = firstname;
        this.lastName = lastName;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Students> studentsList = new ArrayList<>();
        for(int i = 0;i<n;i++){
            String[] commandParts = scan.nextLine().split(" ");
            Students student = new Students(commandParts[0],commandParts[1],Double.parseDouble(commandParts[2]));
            studentsList.add(student);
        }
        Collections.sort(studentsList, Comparator.comparing(Students::getGrade).reversed());
        for(Students student:studentsList){
            System.out.printf("%s %s: %.2f\n",student.getFirstName(),student.getLastName(),student.getGrade() );
        }
    }
}
