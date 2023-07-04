package ObjectAndClasses;

import java.util.*;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> wordsList = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());
        Random rnd = new Random();
        for(int i = 0;i<wordsList.size();i++){
            int newIndex = rnd.nextInt(wordsList.size());
            String temp = wordsList.get(i);
            String temp1 = wordsList.get(newIndex);
            wordsList.set(newIndex,temp);
            wordsList.set(i,temp1);
        }
        for(String e:wordsList){
            System.out.println(e);
        }
    }
}
