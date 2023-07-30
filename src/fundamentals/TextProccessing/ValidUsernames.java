package fundamentals.TextProccessing;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] namesArr = scan.nextLine().split(", ");
        for(String x:namesArr){
            if(checkChars(x) && checkLength(x)){
                System.out.println(x);
            }
        }

    }
    public static boolean checkLength(String name){
        int length = name.length();
        if(length <3 || length >16){
            return false;
        }
        return true;

    }
    public static boolean checkChars(String name){
        for (int i = 0; i < name.length(); i++) {
            char currentSymbol = name.charAt(i);
            if(!Character.isLetter(currentSymbol) && !Character.isDigit(currentSymbol) && currentSymbol != '-' && currentSymbol != '_'){
                return false;
            }

        }
        return true;

    }
}
