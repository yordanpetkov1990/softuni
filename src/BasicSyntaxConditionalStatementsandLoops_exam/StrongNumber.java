package BasicSyntaxConditionalStatementsandLoops_exam;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int startNumber = number;
        int sumFactorial = 0;

        while(number > 0){
            int lastDigit = number % 10;
            int factorial = 1;
            for(int i = 1;i<=lastDigit;i++){
                factorial*= i;
            }
            sumFactorial+=factorial;
            number = number / 10;
        }
        if(startNumber == sumFactorial){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
