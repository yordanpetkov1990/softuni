package fundamentals.MapsLambdaAndStreamAPILab;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, ArrayList<String>> aloda = new LinkedHashMap<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String word = scan.nextLine();
            String synonym = scan.nextLine();
            if(!aloda.containsKey(word)){
                aloda.put(word,new ArrayList<>());
            }
            aloda.get(word).add(synonym);


        }
       for(Map.Entry<String,ArrayList<String>> entry : aloda.entrySet()){
           System.out.println(entry.getKey() + " - " + entry.getValue().toString()
                   .replace("[","").replace("]",""));
       }
    }
}
