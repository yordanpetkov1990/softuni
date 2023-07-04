package fundamentals.Methods_exam;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while(!input.equals("END")){
            System.out.println(isPalindrome(input));
            input =scan.nextLine();
        }
    }
    public static boolean isPalindrome(String input){
        String reversed = "";
        for(int i=input.length()-1;i>=0;i--){
            reversed+=input.charAt(i);
        }
        if(reversed.equals(input)){
            return true;
        }
        else{
            return false;
        }
    }
}
