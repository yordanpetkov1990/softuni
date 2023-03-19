package AdvancedConditional_exam;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String destination ="";
        String typeOfVacation="";
        double price = 0;
        if(budget<=100){
            destination = "Bulgaria";
            if(season.equals("summer")){
                price = 0.3 * budget;
                typeOfVacation = "Camp";
            }
            else {
                price = 0.7 * budget;
                typeOfVacation = "Hotel";
            }
        }
        else if(budget <= 1000){
            destination = "Balkans";
            if(season.equals("summer")){
                price = 0.4 * budget;
                typeOfVacation = "Camp";
            }
            else {
                price = 0.8 * budget;
                typeOfVacation = "Hotel";
            }

        }
        else if(budget > 1000){
            destination = "Europe";
            price = 0.9 * budget;
            typeOfVacation = "Hotel";

        }
        System.out.printf("Somewhere in %s\n%s - %.2f",destination,typeOfVacation,price);


    }
}
