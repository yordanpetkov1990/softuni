package basics.ForLoop;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        for(int i = 0;i<input.length();i++)
        {
            System.out.println(input.charAt(i));
        }
    }
}
