package fundamentals.Methods;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Math.abs(Integer.parseInt(scan.nextLine()));
        int sumOfEvenDigits = 0;
        int sumOfOddDigits = 0;
        while ( n > 0){
            int lastDigit = n % 10;
            if(lastDigit % 2 == 0){
                sumOfEvenDigits+=lastDigit;
            }
            else{
                sumOfOddDigits+=lastDigit;
            }
            n/=10;
        }
        System.out.println(sumOfOddDigits*sumOfEvenDigits);
    }
}
