package fundamentals.StreamAPI_exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        LinkedHashMap<String, ArrayList<String>> courses = new LinkedHashMap<>();
        while(!input.equals("end")){
            String[] commandParts = input.split(" : ");
            String courseName = commandParts[0];
            String studentName = commandParts[1];
            if(!courses.containsKey(courseName)){
                courses.put(courseName,new ArrayList<>());
                courses.get(courseName).add(studentName);
            }
            else{
                courses.get(courseName).add(studentName);
            }
            input = scan.nextLine();
        }
       for(Map.Entry<String,ArrayList<String>> entry : courses.entrySet()){
           System.out.printf("%s: %d\n",entry.getKey(),entry.getValue().size());
           for(int i =0;i<entry.getValue().size();i++){
               System.out.println("-- " + entry.getValue().get(i));
           }
        }
    }
}
