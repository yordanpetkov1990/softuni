package advanced.ExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class FoodFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        words.add("pear");
        words.add("flour");
        words.add("pork");
        words.add("olive");
        List<String> emptyWords = new ArrayList<>();
        emptyWords.add("----");
        emptyWords.add("-----");
        emptyWords.add("----");
        emptyWords.add("-----");

        Deque<String> vowelsQueue = new ArrayDeque<>();
        Deque<String> consonantsStack = new ArrayDeque<>();

        Arrays.stream(scan.nextLine().split("\\s+")).forEach(vowelsQueue::offer);
        Arrays.stream(scan.nextLine().split("\\s+")).forEach(consonantsStack::push);

        while (!consonantsStack.isEmpty()){
            String consonant = consonantsStack.pop();
            String vowel = vowelsQueue.poll();

            for (int i = 0; i < words.size() ; i++) {
                String currentWord = words.get(i);
                for (int y = 0; y < currentWord.length(); y++) {
                    String currentChar = currentWord.charAt(y) + "";
                    if(vowel.equals(currentChar)){
                        String newWord = emptyWords.get(i).substring(0,y) + currentWord.substring(y,y+1) +emptyWords.get(i).substring(y+1);
                        emptyWords.set(i,newWord);

                    }
                    if(consonant.equals(currentChar)){
                        String newWord = emptyWords.get(i).substring(0,y) + currentWord.substring(y,y+1) +emptyWords.get(i).substring(y+1);
                        emptyWords.set(i,newWord);

                    }
                }
            }
            vowelsQueue.offer(vowel);
        }
        List<String> result = emptyWords.stream().filter(s -> !s.contains("-")).collect(Collectors.toList());
        System.out.printf("Words found: %d\n",result.size());
        result.forEach(System.out::println);
    }
}
