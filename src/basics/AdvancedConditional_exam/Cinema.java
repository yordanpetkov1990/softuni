package basics.AdvancedConditional_exam;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String projection = scan.nextLine();
        int rows = Integer.parseInt(scan.nextLine());
        int columns = Integer.parseInt(scan.nextLine());
        double price = 0;
        switch (projection){
            case "Premiere":
                price= rows * columns * 12.00;
                break;
            case "Normal":
                price=rows*columns*7.50;
                break;
            case "Discount":
                price=rows*columns*5.00;
                break;
        }
        System.out.printf("%.2f",price);
    }
}
