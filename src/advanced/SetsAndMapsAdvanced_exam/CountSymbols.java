package advanced.SetsAndMapsAdvanced_exam;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Map<Character,Integer> characterIntegerMap = new TreeMap<>();
        String line = scan.nextLine();
        for (int i = 0; i < line.length(); i++) {
            char currentChar = line.charAt(i);
            if(!characterIntegerMap.containsKey(currentChar)){
                characterIntegerMap.put(currentChar,1);
        }else{
                characterIntegerMap.put(currentChar,characterIntegerMap.get(currentChar) + 1);
            }
    }
        characterIntegerMap.forEach((key,value) -> System.out.printf("%s: %d time/s\n",key,value));
    }
}
