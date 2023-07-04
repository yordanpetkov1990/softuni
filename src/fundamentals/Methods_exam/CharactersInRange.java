package fundamentals.Methods_exam;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char c1 = scan.nextLine().charAt(0);
        char c2 = scan.nextLine().charAt(0);
        characters(c1,c2);

    }
    public static void characters(char a ,char b) {
        if (a < b) {
            for (int i = a + 1; i < b; i++) {
                System.out.printf("%c ", i);
            }
        }
        else{
            for (int i = b + 1; i < a; i++) {
                System.out.printf("%c ", i);
            }
        }
    }
}
