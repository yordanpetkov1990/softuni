package fundamentals.StreamAPI_exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        LinkedHashMap<Character,Integer> wordsCount = new LinkedHashMap<>();
        String[] words = input.split(" ");
        for(String word:words){
            for(int i =0;i<word.length();i++){
                char currentSymbol = word.charAt(i);
                if(!wordsCount.containsKey(currentSymbol)){
                    wordsCount.put(currentSymbol,0);
                }
                wordsCount.put(currentSymbol,wordsCount.get(currentSymbol) + 1);
            }
        }
      for(Map.Entry<Character,Integer> entry : wordsCount.entrySet()){
          System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }

}
