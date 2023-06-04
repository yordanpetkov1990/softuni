package basics.Conditional_exam;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(scan.nextLine());
        double metres = Double.parseDouble(scan.nextLine());
        double timeInSecondsFor1Meter = Double.parseDouble(scan.nextLine());
        double bonusTimes = (int) metres/15 * 12.5;
        double totalTime = metres *timeInSecondsFor1Meter + bonusTimes;
        if (totalTime < recordInSeconds){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTime);
        }
        else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",Math.abs(totalTime-recordInSeconds));
        }
    }
}
