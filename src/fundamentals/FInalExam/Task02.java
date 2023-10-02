package fundamentals.FInalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = "!(?<command>[A-Z][a-z]{2,})!:\\[(?<name>[A-Za-z]{8,})\\]";
        int n = Integer.parseInt(scan.nextLine());
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                String name = matcher.group("name");
                String command = matcher.group("command");
                System.out.print(command + ": ");
                for(char c:name.toCharArray()){
                    System.out.print((int) c + " ");
                }
                System.out.println();

            }else{
                System.out.println("The message is invalid");
            }
        }
    }
}
