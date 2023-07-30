package fundamentals.Archive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = "(\\:{2}|\\*{2})(?<emoji>[A-Z][a-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        String input = scan.nextLine();
        int count = 0;
        List<String> coolOnes = new ArrayList<>();
        int threshhold = 1;
        Matcher matcher = pattern.matcher(input);
        for(char c:input.toCharArray()){
            if(Character.isDigit(c)){
                threshhold*=Integer.parseInt(c+"");
            }
        }
        while (matcher.find()){
            count++;
            String full = matcher.group();
            String emoji = matcher.group("emoji");
            int coolness = 0;
            for(char x:emoji.toCharArray()){
                coolness+=(int) x;
            }
            if(coolness > threshhold){
                coolOnes.add(full);
            }

        }
        System.out.println("Cool threshold: " + threshhold);
        System.out.printf("%d emojis found in the text. The cool ones are: \n",count);
        for(String emoji:coolOnes){
            System.out.println(emoji);
        }

    }
}
