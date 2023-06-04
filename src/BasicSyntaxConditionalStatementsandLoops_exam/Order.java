package BasicSyntaxConditionalStatementsandLoops_exam;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= Integer.parseInt(scan.nextLine());
        double totalPrice = 0.00;
        while(n>=1){
            double price_per_capsule = Double.parseDouble(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());
            int count = Integer.parseInt(scan.nextLine());
            double currentOrder = (days * count) * price_per_capsule;
            totalPrice += currentOrder;
            System.out.printf("The price for the coffee is: $%.2f\n",currentOrder);
            n--;
        }
        System.out.printf("Total: $%.2f",totalPrice);
    }
}
