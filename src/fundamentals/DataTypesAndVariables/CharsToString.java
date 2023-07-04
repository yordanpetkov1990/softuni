package fundamentals.DataTypesAndVariables;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result = "";
        for(int i =0;i<3;i++){
            char currentChar = scan.nextLine().charAt(0);
            result+=currentChar;
        }
        System.out.println(result);
    }
}
