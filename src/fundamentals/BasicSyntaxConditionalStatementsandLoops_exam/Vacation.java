package fundamentals.BasicSyntaxConditionalStatementsandLoops_exam;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());
        String typeOfPeople = scan.nextLine();
        String day = scan.nextLine();
        double price = 0.00;

        if(day.equals("Friday")){
            if(typeOfPeople.equals("Students")){
                price = count * 8.45;
            }else if(typeOfPeople.equals("Business")){
                price = count * 10.90;
            }else if(typeOfPeople.equals("Regular")){
                price = count * 15;
            }
        }else if(day.equals("Saturday")){
            if(typeOfPeople.equals("Students")){
                price = count * 9.80;
            }else if(typeOfPeople.equals("Business")){
                price = count * 15.60;
            }else if(typeOfPeople.equals("Regular")){
                price = count * 20;
            }

        }else if(day.equals("Sunday")){
            if(typeOfPeople.equals("Students")){
                price = count * 10.46;
            }else if(typeOfPeople.equals("Business")){
                price = count * 16;
            }else if(typeOfPeople.equals("Regular")){
                price = count * 22.50;
            }

        }
        if(typeOfPeople.equals("Students") && count>=30){
            price = price - (price * 0.15);
        }else if(typeOfPeople.equals("Business") && count>=100){
            price = price - (price / count * 10);
        }else if(typeOfPeople.equals("Regular") && count >=10 && count <=20){
            price = price - (price * 0.05);
        }
        System.out.printf("Total price: %.2f\n",price);


    }
}
