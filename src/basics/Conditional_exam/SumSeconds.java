package basics.Conditional_exam;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstTime = Integer.parseInt(scan.nextLine());
        int secondTime = Integer.parseInt(scan.nextLine());
        int thirdTime = Integer.parseInt(scan.nextLine());

        int totalTimeSeconds= firstTime + secondTime + thirdTime;
        int totalMinutes = totalTimeSeconds / 60;
        int totalSecondsLeft = totalTimeSeconds % 60;
        if(totalSecondsLeft < 10){
            System.out.printf("%d:0%d",totalMinutes,totalSecondsLeft);
        }
        else {
            System.out.printf("%d:%d",totalMinutes,totalSecondsLeft);
        }

    }
}
