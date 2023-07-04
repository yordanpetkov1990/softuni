package fundamentals.Methods;

import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        checkSing(Integer.parseInt(scan.nextLine()));
    }
    public static void checkSing(int number){
        if(number > 0){
            System.out.printf("The number %d is positive.",number);
        }
        else if(number < 0){
            System.out.printf("The number %d is negative.",number);
        }
        else{
            System.out.printf("The number %d is zero.",number);
        }
    }
}
