package fundamentals.StreamAPI_exercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        LinkedHashMap<String, ArrayList<Double>> students = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String studentName = scan.nextLine();
            double grade=Double.parseDouble(scan.nextLine());
            if(!students.containsKey(studentName)){
                students.put(studentName,new ArrayList<>());
                students.get(studentName).add((grade));
            }
            else{
                students.get(studentName).add((grade));
            }

        }
        for(Map.Entry<String,ArrayList<Double>> entry:students.entrySet()){
            double averageGrade = 0.00;
            int listGradesSize = entry.getValue().size();
            for(int y =0;y<listGradesSize;y++){
                averageGrade+=entry.getValue().get(y);
            }
            averageGrade/=listGradesSize;
            if(averageGrade >=4.50){
                System.out.println(String.format(entry.getKey() + " -> %.2f",averageGrade));
            }
        }
    }
}
