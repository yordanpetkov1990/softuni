package basics.AdvancedConditional;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String city = scan.nextLine();
        double procent = 0;
        double sells = Double.parseDouble(scan.nextLine());
        if(city.equals("Sofia")){
            if(sells >= 0 && sells <=500){
                procent = 5;
            }
            else if(sells > 500 && sells <=1000){
                procent = 7;
            }
            else if(sells > 1000 && sells <=10000){
                procent = 8;
            }
            else if(sells > 10000){
                procent = 12;
            }
        }
        else if(city.equals("Varna")){
            if(sells >= 0 && sells <=500){
                procent = 4.5;
            }
            else if(sells > 500 && sells <=1000){
                procent = 7.5;
            }
            else if(sells > 1000 && sells <=10000){
                procent = 10;
            }
            else if(sells > 10000){
                procent = 13;
            }
        }
        else if(city.equals("Plovdiv")){
            if(sells >= 0 && sells <=500){
                procent = 5.5;
            }
            else if(sells > 500 && sells <=1000){
                procent = 8;
            }
            else if(sells > 1000 && sells <=10000){
                procent = 12;
            }
            else if(sells > 10000){
                procent = 14.5;
            }
        }
        if(procent > 0){
            double commission = sells * procent / 100;
            System.out.printf("%.2f",commission);
        }
        else {
            System.out.println("error");
        }
    }
}
