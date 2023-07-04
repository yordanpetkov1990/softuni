package BasicSyntax_MoreExercise;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        String value = String.valueOf(number);
        System.out.println(function(value));

    }
    public static String function(String x){
        char lastDigit = x.charAt(x.length()-1);
        switch (lastDigit){
            case '0':
                return "zero";
            case '1':
                return "one";
            case '2':
                return "two";
            case '3':
                return "three";
            case '4':
                return "four";
            case '5':
                return "five";
            case '6':
                return "six";
            case '7':
                return "seven";
            case '8':
                return "eight";
            case '9':
                return "nine";
        }
        return "no";
    }
}
