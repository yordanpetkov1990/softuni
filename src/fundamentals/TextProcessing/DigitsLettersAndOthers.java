package fundamentals.TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitsLettersAndOthers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Character> digits = new ArrayList<>();
        List<Character> letters = new ArrayList<>();
        List<Character> others = new ArrayList<>();

        String input = scan.nextLine();

        for (int i = 0; i <input.length() ; i++) {
            char currentSymbol = input.charAt(i);
            if(Character.isDigit(currentSymbol)){
                digits.add(currentSymbol);
            }
            else if(Character.isLetter(currentSymbol)){
                letters.add(currentSymbol);
            }
            else {
                others.add(currentSymbol);
            }
        }
        for(Character current:digits){
            System.out.print(current);
        }
        System.out.println();
        for(Character current:letters){
            System.out.print(current);
        }
        System.out.println();
        for(Character current:others){
            System.out.print(current);
        }
        System.out.println();
    }
}
