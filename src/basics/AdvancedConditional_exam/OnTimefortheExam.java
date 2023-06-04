package basics.AdvancedConditional_exam;

import java.util.Scanner;

public class OnTimefortheExam {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        int hourOfTheExam = Integer.parseInt(scan.nextLine());
        int minutesOfTheExam = Integer.parseInt(scan.nextLine());
        int hourOfArrival = Integer.parseInt(scan.nextLine());
        int minutesOfArrival = Integer.parseInt(scan.nextLine());

        int totalMinutesOfTheExam= minutesOfTheExam + hourOfTheExam * 60;
        int totalMinutesOfTheArrival= minutesOfArrival + hourOfArrival * 60;

        int diff = Math.abs(totalMinutesOfTheExam- totalMinutesOfTheArrival);
        int hoursOfDiff = diff / 60;
        int minutesOfDiff = diff % 60;

        if(totalMinutesOfTheArrival > totalMinutesOfTheExam){
            if(diff > 0 && diff <60){
                    System.out.printf("Late\n%d minutes after the start",totalMinutesOfTheArrival-totalMinutesOfTheExam);
            }
            else if(diff > 0 && diff >= 60){
                if(minutesOfDiff <10) {
                    System.out.printf("Late\n%d:0%d hours after the start",hoursOfDiff,minutesOfDiff);
                }
                else{
                    System.out.printf("Late\n%d:%d hours after the start",hoursOfDiff,minutesOfDiff);
                }


            }
            else{
                System.out.printf("Late");
            }

        }
        else if(totalMinutesOfTheArrival == totalMinutesOfTheExam || totalMinutesOfTheExam - totalMinutesOfTheArrival <= 30){
            if(diff >0 && diff < 60){
                System.out.printf("On time\n%d minutes before the start",minutesOfDiff);
            }
            else if(diff > 0 && diff >= 60){
                if(minutesOfDiff <10) {
                    System.out.printf("On time\n%d:0%d hours before the start",hoursOfDiff,minutesOfDiff);
                }
                else{
                    System.out.printf("On time\n%d:%d hours before the start",hoursOfDiff,minutesOfDiff);
                }


            }
            else{
                System.out.printf("On time");
            }


        }
        else{
            if(diff >0 && diff < 60){
                    System.out.printf("Early\n%d minutes before the start",minutesOfDiff);
            }
            else if(diff > 0 && diff >= 60){
                if(minutesOfDiff <10) {
                    System.out.printf("Early\n%d:0%d hours before the start", hoursOfDiff, minutesOfDiff);
                }
                else{
                    System.out.printf("Early\n%d:%d hours before the start", hoursOfDiff, minutesOfDiff);
                }
            }
            else{
                System.out.printf("Early");
            }
        }


    }
}
