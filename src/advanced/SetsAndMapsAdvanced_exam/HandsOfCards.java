package advanced.SetsAndMapsAdvanced_exam;

import java.util.*;
import java.util.stream.Collectors;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<String> deck = new LinkedHashSet<>();
        Map<String,Integer> powerOfCards = new LinkedHashMap<>();
        powerOfCards.put("2",2);
        powerOfCards.put("3",3);
        powerOfCards.put("4",4);
        powerOfCards.put("5",5);
        powerOfCards.put("6",6);
        powerOfCards.put("7",7);
        powerOfCards.put("8",8);
        powerOfCards.put("9",9);
        powerOfCards.put("10",10);
        powerOfCards.put("J",11);
        powerOfCards.put("Q",12);
        powerOfCards.put("K",13);
        powerOfCards.put("A",14);
        Map<String,Integer> typeOfCards = new LinkedHashMap<>();
        typeOfCards.put("S",4);
        typeOfCards.put("H",3);
        typeOfCards.put("D",2);
        typeOfCards.put("C",1);
        Map<String,Integer> people = new LinkedHashMap<>();
        Map<String,Set<String>> peopleAndDecks = new LinkedHashMap<>();
        String command = scan.nextLine();
        while(!"JOKER".equals(command)){
            String[] tokens = command.split(": ");
            String personName = tokens[0];
            deck = Arrays.stream(tokens[1].split(", ")).collect(Collectors.toSet());
            peopleAndDecks.putIfAbsent(personName,new LinkedHashSet<>());
            for (String card : deck) {
                peopleAndDecks.get(personName).add(card);
            }

            command = scan.nextLine();
        }

        peopleAndDecks.forEach((k,v) ->{
            int overAllSum = 0;
            for (String card : v) {
                int currentSum =0;
                String power = card.substring(0,card.length()-1);
                String type = card.substring(card.length()-1);
                if(powerOfCards.containsKey(power)){
                    currentSum+=powerOfCards.get(power);
                }
                if(typeOfCards.containsKey(type)){
                    currentSum*=typeOfCards.get(type);
                }
                overAllSum+=currentSum;
            }
            people.putIfAbsent(k,0);
            people.put(k,people.get(k)+overAllSum);
        });
        people.forEach((k,v) ->{
            System.out.printf("%s: %d\n",k,v);
        });
    }
}
