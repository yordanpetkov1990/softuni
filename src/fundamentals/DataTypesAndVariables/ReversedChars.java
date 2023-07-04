package fundamentals.DataTypesAndVariables;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String result = "";
        for(int i =0;i<3;i++){
            char currentChar = scan.nextLine().charAt(0);
            result+=currentChar;
        }
        for(int i = result.length()-1;i>=0;i--){
            System.out.printf("%s ",result.charAt(i));
        }
        System.out.println();
    }
}
