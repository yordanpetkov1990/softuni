package ForLoop_exam;

import java.util.Scanner;

public class CleverLilly {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());
        double washing_machine = Double.parseDouble(scan.nextLine());
        int toy_price = Integer.parseInt(scan.nextLine());
        double money = 0;
        double receiveMoney = 10;
        int toys_count = 0;
        double all_money = 0;

        for(int i = 1;i<=age;i++)
        {
            if(i % 2 == 0 && i != 0)
            {
                money+=receiveMoney;
                receiveMoney+=10;
                money--;
            }
            else{
                toys_count+=1;
            }

        }
        all_money = toys_count * toy_price + money;
        if(all_money>=washing_machine){
            System.out.printf("Yes! %.2f",all_money-washing_machine);
        }
        else{
            System.out.printf("No! %.2f",Math.abs(all_money-washing_machine));
        }

    }
}
