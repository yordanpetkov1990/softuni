package WhileLoop;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        double balance = 0;

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();


        while(!input.equals("NoMoreMoney")){
            double x = Double.parseDouble(input);
            if(x < 0)
            {
                System.out.println("Invalid operation!");
                break;
            }
            balance+=x;
            System.out.printf("Increase: %.2f\n",x);
            input = scan.nextLine();
        }
        System.out.printf("Total: %.2f",balance);
    }
}
