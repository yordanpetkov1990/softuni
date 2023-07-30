package fundamentals.TextProcessing;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] commandParts = scan.nextLine().split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < commandParts.length; i++) {
            for (int j = 0; j < commandParts[i].length(); j++) {
                result.append(commandParts[i]);
            }
        }
        System.out.println(result);

    }

}
