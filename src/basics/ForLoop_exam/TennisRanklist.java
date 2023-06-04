package basics.ForLoop_exam;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count_tournaments = Integer.parseInt(scan.nextLine());
        int points = Integer.parseInt(scan.nextLine());
        int bonus_points = 0;
        int won_tournaments_count = 0;
        for(int i = 0;i<count_tournaments;i++)
        {
            String text = scan.nextLine();
            switch (text){
                case "W":
                    bonus_points+=2000;
                    won_tournaments_count++;
                    break;
                case "F":
                    bonus_points+=1200;
                    break;
                case "SF":
                    bonus_points+=720;
                    break;
            }
        }
        points+=bonus_points;
        System.out.printf("Final points: %d\n",points);
        System.out.printf("Average points: %d\n",bonus_points  / count_tournaments);
        System.out.printf("%.2f%%%n", (double)won_tournaments_count/count_tournaments * 100);
    }
}
