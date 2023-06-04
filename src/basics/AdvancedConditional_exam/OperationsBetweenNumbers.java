package basics.AdvancedConditional_exam;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        double result = 0;
        switch (operator){
            case "+":
                result = n1+n2;
                break;
            case "-":
                result= n1-n2;
                break;
            case "*":
                result=n1*n2;
                break;
            case "/":
                if(n2!=0){
                    result=n1/n2;
                }
                else{
                    System.out.printf("Cannot divide %d by zero",n1);
                }
                break;
            case "%":
                if(n2!=0){
                    result=n1%n2;
                }
                else{
                    System.out.printf("Cannot divide %d by zero",n1);
                }
                break;
        }
        switch (operator){
            case "+":
            case "-":
            case "*":
                if(result % 2 == 0){
                    System.out.printf("%d %s %d = %.0f - even",n1,operator,n2,result);
                }
                else{
                    System.out.printf("%d %s %d = %.0f - odd",n1,operator,n2,result);
                }
                break;
            case "/":
                System.out.printf("%d / %d = %.2f",n1,n2,result);
                break;
            case "%":
                System.out.printf("%d %s %d = %.0f", n1,operator,n2,result);
                break;
        }

    }
}
