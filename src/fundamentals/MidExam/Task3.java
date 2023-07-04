package fundamentals.MidExam;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double totalProfit = 0.00;
        for(int i = 1;i<=n;i++){
            String name = scan.nextLine();
            double income = Double.parseDouble(scan.nextLine());
            double expenses = Double.parseDouble(scan.nextLine());
            if(i % 3 == 0 && i % 5 != 0){
                expenses = expenses + (0.5*expenses);
            }
            if(i % 5 == 0){
                income = income - (0.1*income);
            }
            totalProfit+=income-expenses;
            System.out.printf("In %s Burger Bus earned %.2f leva.\n",name,income-expenses);
        }
        System.out.printf("Burger Bus total profit: %.2f leva.",totalProfit);

    }
}
