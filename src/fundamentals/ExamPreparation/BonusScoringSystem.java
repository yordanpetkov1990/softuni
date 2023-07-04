package fundamentals.ExamPreparation;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countStudents = Integer.parseInt(scan.nextLine());
        int countLectures = Integer.parseInt(scan.nextLine());
        int initialbonus = Integer.parseInt(scan.nextLine());
        double maxBonus = 0;
        int maxAttendacies = 0;
        for(int i= 0;i<countStudents;i++){
            double totalBonus = 0;
            int attendacies = Integer.parseInt(scan.nextLine());
            totalBonus = attendacies * 1.0 / countLectures * (5+initialbonus);
            if(totalBonus > maxBonus){
                maxBonus = totalBonus;
                maxAttendacies = attendacies;

            }
        }
        System.out.printf("Max Bonus: %.0f.\n",Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.",maxAttendacies);
    }
}
