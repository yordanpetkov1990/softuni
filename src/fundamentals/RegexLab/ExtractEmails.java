package fundamentals.RegexLab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String regex = "\\b(?<user>[A-Za-z0-9]+[\\.\\,\\-\\_]?[A-Za-z0-9]+)@[A-Za-z]+[-]?[A-Za-z]*([.][A-Za-z]+[-]?[A-Za-z]*)+\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }

}
