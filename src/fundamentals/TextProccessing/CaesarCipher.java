package fundamentals.TextProccessing;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(encryptText(input));
    }
    public static String encryptText(String x){
        String encryptedText = "";
        for (int i = 0; i <x.length() ; i++) {
            char currentSymbol = x.charAt(i);
            char encryptedSymbol = (char) (currentSymbol + 3);
            encryptedText+=encryptedSymbol;
        }
        return encryptedText;
    }
}
