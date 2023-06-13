package fundamentals.BasicSyntaxConditionalStatementsandLoops_exam;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double totalSumInserted = 0.00;
        String input = scan.nextLine();
        while(!input.equals("Start")){
            double money = Double.parseDouble(input);
            if(money == 2){
                totalSumInserted+=money;
            }else if(money == 1){
                totalSumInserted+=money;
            }else if(money == 0.5){
                totalSumInserted+=money;
            }
            else if(money == 0.2){
                totalSumInserted+=money;
            }else if(money == 0.1){
                totalSumInserted+=money;
            }else{
                System.out.printf("Cannot accept %.2f\n",money);
            }
            input = scan.nextLine();

        }
        String input2 = scan.nextLine();
        while(!input2.equals("End")){
            if(input2.equals("Nuts")){
                if(totalSumInserted >= 2.0){
                    System.out.printf("Purchased Nuts\n");
                    totalSumInserted-=2.0;
                }else{
                    System.out.println("Sorry, not enough money");
                }
            }else if(input2.equals("Water")){
                if(totalSumInserted >= 0.7){
                    totalSumInserted-=0.7;
                    System.out.printf("Purchased Water\n");
                }else{
                    System.out.println("Sorry, not enough money");
                }
            }else if(input2.equals("Crisps")){
                if(totalSumInserted >= 1.5){
                    totalSumInserted-=1.5;
                    System.out.printf("Purchased Crisps\n");
                }else{
                    System.out.println("Sorry, not enough money");
                }
            }else if(input2.equals("Soda")){
                if(totalSumInserted >= 0.8){
                    totalSumInserted-=0.8;
                    System.out.printf("Purchased Soda\n");
                }else{
                    System.out.println("Sorry, not enough money");
                }
            }else if(input2.equals("Coke")){
                if(totalSumInserted >= 1.0){
                    totalSumInserted-=1.0;
                    System.out.printf("Purchased Coke\n");
                }else{
                    System.out.println("Sorry, not enough money");
                }
            }else{
                System.out.println("Invalid product");
            }
            input2 = scan.nextLine();
        }
        double change = totalSumInserted;
        System.out.printf("Change: %.2f\n",change);
    }
}
