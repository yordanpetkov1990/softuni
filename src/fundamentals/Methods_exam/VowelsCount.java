package fundamentals.Methods_exam;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        countVowels(input);

    }
    public static void countVowels(String input){
        String lowercase = input.toLowerCase();
        int count = 0;
        char[] vowels={'a','o','e','i','u'};
        for(int i = 0;i<input.length();i++){
            char currentChar = lowercase.charAt(i);
            for(int y = 0;y<vowels.length;y++){
                if(currentChar == vowels[y]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
