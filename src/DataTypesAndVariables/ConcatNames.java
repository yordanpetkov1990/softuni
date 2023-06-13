package DataTypesAndVariables;

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        String delimeter = scan.nextLine();
        System.out.printf("%s%s%s\n",firstName,delimeter,lastName);
    }
}
