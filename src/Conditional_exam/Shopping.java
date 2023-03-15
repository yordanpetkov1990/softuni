package Conditional_exam;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int gpu_count = Integer.parseInt(scan.nextLine());
        int cpu_count = Integer.parseInt(scan.nextLine());
        int ram_count = Integer.parseInt(scan.nextLine());
        double gpu_price = gpu_count * 250;
        double cpu_price =0.35 * gpu_price * cpu_count;
        double ram_price = 0.10 * gpu_price * ram_count;
        double totalPrice = gpu_price+cpu_price+ram_price;
        if(gpu_count > cpu_count){
            totalPrice-=totalPrice*0.15;
        }
        if (totalPrice > budget){
            System.out.printf("Not enough money! You need %.2f leva more!",Math.abs(totalPrice-budget));
        }
        else{
            System.out.printf("You have %.2f leva left!",budget-totalPrice);
        }
    }
}
