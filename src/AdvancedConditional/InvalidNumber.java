package AdvancedConditional;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        boolean isValid = (number <= 200 && number >= 100) || number == 0;
        if(!isValid){
            System.out.println("invalid");
        }

    }
}
