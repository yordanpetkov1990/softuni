package DataTypesaAndVariables_EXAM;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;

        for(int i =0;i<n;i++){
            char currentChar = scan.nextLine().charAt(0);
            sum+=currentChar;
        }
        System.out.println("The sum equals: " +sum);
    }
}
