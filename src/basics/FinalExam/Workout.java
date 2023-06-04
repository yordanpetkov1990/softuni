package basics.FinalExam;

import java.util.Scanner;

public class Workout {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count_days = Integer.parseInt(scan.nextLine());
        double kilometers_first_day = Double.parseDouble(scan.nextLine());
        double final_kilometers = 0 + kilometers_first_day;

        for(int i = 0;i<count_days;i++){
            int x = Integer.parseInt(scan.nextLine());
            double percent = x * 1.0 / 100;
            kilometers_first_day = kilometers_first_day + (kilometers_first_day * percent);
            final_kilometers+=kilometers_first_day;
        }
        if(final_kilometers >= 1000){
            System.out.printf("You've done a great job running %.0f more kilometers!",Math.ceil(final_kilometers-1000));
        }
        else{
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers",Math.ceil(1000-final_kilometers));
        }

    }
}
