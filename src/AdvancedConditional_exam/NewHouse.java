package AdvancedConditional_exam;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String flower=scan.nextLine();
        int countFlowers = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());
        double price = 0;
        switch (flower){
            case "Roses":
                price = countFlowers * 5.00;
                if(countFlowers>80){
                    price-=price*0.10;
                }
                break;
            case "Dahlias":
                price = countFlowers * 3.80;
                if(countFlowers>90){
                    price-=price*0.15;
                }
                break;
            case "Tulips":
                price = countFlowers * 2.80;
                if(countFlowers>80){
                    price-=price*0.15;
                }
                break;
            case "Narcissus":
                price = countFlowers * 3.00;
                if(countFlowers<120){
                    price+=price*0.15;
                }
                break;
            case "Gladiolus":
                price = countFlowers * 2.50;
                if(countFlowers<80){
                    price+=price*0.20;
                }
                break;

        }
        if(budget>= price){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",countFlowers,flower,Math.abs(price-budget)
            );
        }
        else{
            System.out.printf("Not enough money, you need %.2f leva more.",Math.abs(price-budget));
        }
    }
}
