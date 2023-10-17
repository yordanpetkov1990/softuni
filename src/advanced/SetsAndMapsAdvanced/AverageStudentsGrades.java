package advanced.SetsAndMapsAdvanced;

import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, List<Double>> studentsRecord = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split(" ");
            String student = tokens[0];
            double grade = Double.parseDouble(tokens[1]);
            studentsRecord.putIfAbsent(student,new ArrayList<>());
            studentsRecord.get(student).add(grade);
        }
        for (Map.Entry<String, List<Double>> stringListEntry : studentsRecord.entrySet()) {
            String studentName = stringListEntry.getKey();
            List<Double> value = stringListEntry.getValue();
            double average = 0;
            for (Double x : value) {
                average+=x;
            }
            average/=value.size();
            System.out.printf("%s -> ",studentName);
            for (Double aDouble : value) {
                System.out.printf("%.2f ",aDouble);
            }
            System.out.printf("(avg: %.2f)\n",average);

        }
    }
}
