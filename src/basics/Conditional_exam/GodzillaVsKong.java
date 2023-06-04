package basics.Conditional_exam;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int count_statisti = Integer.parseInt(scan.nextLine());
        double money_per_clothers_for_one_statist = Double.parseDouble(scan.nextLine());
        double decoration = budget * 0.10;
        double clothes = money_per_clothers_for_one_statist * count_statisti;
        if (count_statisti > 150)
        {
            clothes-=clothes*0.10;
        }
        double totalSum= clothes + decoration;
        if(totalSum > budget){
            System.out.printf("Not enough money!\n" +
                    "Wingard needs %.2f leva more.\n",Math.abs(totalSum-budget));
        }
        else{
            System.out.printf("Action! \n" +
                    "Wingard starts filming with %.2f leva left.",Math.abs(totalSum-budget));
        }
    }
}
