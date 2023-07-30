package fundamentals.TextProcessing;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String stringToRemove = scan.nextLine();
        String result = scan. nextLine();
        while(result.indexOf(stringToRemove) != -1){
            result = result.replace(stringToRemove,"");
        }

        System.out.println(result);
    }
}
