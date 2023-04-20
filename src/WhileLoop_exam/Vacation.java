package WhileLoop_exam;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double trip = Double.parseDouble(scan.nextLine());
        double avaible_amount = Double.parseDouble(scan.nextLine());
        int spending_count = 0;
        int daysCount = 0;
        boolean isValid = true;

        while (isValid){

            String doing = scan.nextLine();
            double price = Double.parseDouble(scan.nextLine());
            daysCount++;

            if(doing.equals("spend")){
                spending_count++;
                avaible_amount-=price;
                if(spending_count==5){
                    System.out.printf("You can't save the money.\n");
                    System.out.printf("%d",spending_count);
                    return;
                }
                if(avaible_amount < 0){
                    avaible_amount = 0;
                }
            }
            else if(doing.equals("save")){
                spending_count = 0;
                avaible_amount+=price;
            }
            if(avaible_amount>=trip){
                System.out.printf("You saved the money for %d days.",daysCount);
                isValid=false;
            }

        }
    }
}
