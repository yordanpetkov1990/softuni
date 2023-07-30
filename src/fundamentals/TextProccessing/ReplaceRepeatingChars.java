package fundamentals.TextProccessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char[] ch = input.toCharArray();
        List<Character> characterList = new ArrayList<>();
        for (int i = 0; i < ch.length; i++) {
                characterList.add(ch[i]);
        }
        for (int i = 0; i <characterList.size()-1 ; i++) {
            char currentSymbol = characterList.get(i);
            char nextSymbol = characterList.get(i+1);
            if(currentSymbol==nextSymbol){
                characterList.remove(i+1);
                i= -1;
            }
        }
        for(char c:characterList){
            System.out.print(c+ "");
        }


    }
}
