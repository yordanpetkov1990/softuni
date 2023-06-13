package DataTypesaAndVariables_EXAM;

import java.util.Scanner;

public class PrintPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNum = Integer.parseInt(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());

        for(int i=firstNum;i<=secondNum;i++){
            System.out.printf("%c ",i);
        }
    }
}
