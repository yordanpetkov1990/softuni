package fundamentals.Archive;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String input = scan.nextLine();
        while(!input.equals("Decode")){
            String[] commandParts  = input.split("\\|");
            String commandName = commandParts[0];
            switch (commandName){
                case "Move":
                    int n = Integer.parseInt(commandParts[1]);
                    String newString = "";
                    for (int i = 0; i < n; i++) {
                        newString+=message.charAt(i);
                    }
                    message =message.replace(newString,"");
                    message+=newString;

                    break;
                case "Insert":
                    int index = Integer.parseInt(commandParts[1]);
                    String value = commandParts[2];
                    List<String> chars = Arrays.stream(message.split("")).collect(Collectors.toList());
                    chars.add(index,value);
                    message = String.join("",chars);

                    break;
                case "ChangeAll":
                    String substring = commandParts[1];
                    String replacement = commandParts[2];
                    message =message.replace(substring,replacement);

                    break;
            }
            input = scan.nextLine();
        }
        System.out.println("The decrypted message is: " + message);
    }
}
