package DataTypesaAndVariables_EXAM;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNum = Integer.parseInt(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());
        int thirdum = Integer.parseInt(scan.nextLine());
        int fourthNum = Integer.parseInt(scan.nextLine());

        int result = firstNum+secondNum;
        result/=thirdum;
        result*=fourthNum;
        System.out.println(result);
    }
}
