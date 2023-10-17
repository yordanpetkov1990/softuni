package advanced.SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Voina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<Integer> integerSet1 = new LinkedHashSet<>();
        Set<Integer> integerSet2 = new LinkedHashSet<>();

        Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).forEach(integerSet1::add);
        Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).forEach(integerSet2::add);
        int round = 50;
        while(round-- > 0 && !integerSet1.isEmpty() && !integerSet2.isEmpty()){
            int card1 = integerSet1.iterator().next();
            int card2 = integerSet2.iterator().next();
            integerSet1.remove(card1);
            integerSet2.remove(card2);

            if(card1>card2){
                integerSet1.add(card1);
                integerSet1.add(card2);
            }else if(card2 > card1){
                integerSet2.add(card1);
                integerSet2.add(card2);
            }
        }


        if(integerSet1.size() > integerSet2.size()){
            System.out.println("First player win!");
        }else if(integerSet1.size() < integerSet2.size()){
            System.out.println("Second player win!");
        }else{
            System.out.println("Draw!");
        }
    }
}
