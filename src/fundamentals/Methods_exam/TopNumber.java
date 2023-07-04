package fundamentals.Methods_exam;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n  = Integer.parseInt(scan.nextLine());
        for(int i = 1;i<=n;i++){
            boolean isOddDigit = false;
            boolean isValid = false;
            int sum = 0;
            int currentNumber = i;
            while(currentNumber > 0){
                int lastDigit = currentNumber % 10;
                if(lastDigit % 2 != 0){
                    isOddDigit=true;
                }
                sum+=lastDigit;
                currentNumber/=10;
            }
            if(sum % 8 == 0){
                isValid = true;
            }
            if(isValid && isOddDigit){
                System.out.println(i);
            }

        }
    }
}
