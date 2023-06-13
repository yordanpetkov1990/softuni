package DataTypesaAndVariables_EXAM;

import java.util.Scanner;

public class SnowBalls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Double max = Double.MIN_VALUE;
        int maxSnowBall = 0;
        int maxSnowBallTime = 0;
        int maxSnowBallQuality = 0;
        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(scan.nextLine());
            int snowballTime = Integer.parseInt(scan.nextLine());
            int snowballQuality = Integer.parseInt(scan.nextLine());
            double x = (double) snowballSnow / snowballTime;
            double c = (double) snowballQuality;
            double snowballValue = Math.pow(x,c);
            if(snowballValue>=max){
                max = snowballValue;
                maxSnowBall = snowballSnow;
                maxSnowBallTime = snowballTime;
                maxSnowBallQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",maxSnowBall,maxSnowBallTime,max,maxSnowBallQuality);
    }
}
