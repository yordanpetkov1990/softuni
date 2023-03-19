package AdvancedConditional_exam;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int degrees=Integer.parseInt(scan.nextLine());
        String outfit="";
        String shoes="";
        String time =scan.nextLine();
        if(time.equals("Morning")){
            if(degrees>= 10 && degrees <=18){
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            }
            else if(degrees > 18 && degrees <=24){
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            else if(degrees >= 25){
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        }
        else if(time.equals("Afternoon")){
            if(degrees>= 10 && degrees <=18){
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            else if(degrees > 18 && degrees <=24){
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
            else if(degrees >= 25){
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }

        }
        else if(time.equals("Evening")){
            if(degrees>= 10 && degrees <=18){
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            else if(degrees > 18 && degrees <=24){
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            else if(degrees >= 25){
                outfit = "Shirt";
                shoes = "Moccasins";
            }

        }
        System.out.printf("It's %d degrees, get your %s and %s.",degrees,outfit,shoes);
    }
}
