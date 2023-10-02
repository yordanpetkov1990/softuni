package fundamentals.FInalExam;

import java.util.*;

public class Task03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, ArrayList<String>> dictionary = new LinkedHashMap<>();
        String input = scan.nextLine();
        String[] tokens = input.split(" \\| ");
        for(String token:tokens){
            String[] commandParts = token.split(": ");
            String word = commandParts[0];
            String definition = commandParts[1];
            if(!dictionary.containsKey(word)){
                dictionary.put(word,new ArrayList<>());
                dictionary.get(word).add(definition);
            }else{
                dictionary.get(word).add(definition);
            }
        }
        String[] testWords = scan.nextLine().split(" \\| ");
        String finalCommand = scan.nextLine();
        if(finalCommand.equals("Test")){
            for(String testWord:testWords){
                if(dictionary.containsKey(testWord)){
                    System.out.println(testWord + ":");
                    List<String> list = dictionary.get(testWord);
                    for(String e:list){
                        System.out.printf(" -%s\n",e);
                    }
                }
            }
        }else if(finalCommand.equals("Hand Over")){
            for(Map.Entry<String,ArrayList<String>> entry:dictionary.entrySet()){
                System.out.printf("%s ",entry.getKey());
            }
            System.out.println();
        }
    }
}
