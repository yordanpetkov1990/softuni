package fundamentals.MapsLambdaAndStreamAPILab;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] wordsArray = scan.nextLine().split(" ");
        LinkedHashMap<String,Integer> counts = new LinkedHashMap<>();
        for(String word:wordsArray){
            String result = word.toLowerCase();
            if(!counts.containsKey(result)){
                counts.put(result,1);
            }
            else{
                counts.put(result,counts.get(result) + 1);
            }
        }
        List<String> stringList = new ArrayList<>();
        for(Map.Entry<String,Integer> entry:counts.entrySet()){
            if(entry.getValue() % 2 != 0){
                stringList.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ",stringList));
    }
}
