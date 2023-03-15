package Conditional_exam;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double bonusScore = Double.parseDouble(scan.nextLine());
        double bonus = 0;
        if (bonusScore<=100){
            bonus+=5;
        }
        else if(bonusScore <= 1000){
            bonus+=bonusScore*0.2;
        }
        else{
            bonus+=bonusScore*0.1;
        }
        if(bonusScore % 2 == 0){
            bonus+=1;
        }
        if(bonusScore % 10 == 5){
            bonus+=2;
        }
        bonusScore+=bonus;
        System.out.printf("%.1f\n%.1f",bonus,bonusScore);
    }

}
