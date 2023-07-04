package fundamentals.List_exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        List<Integer> deck1 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> deck2 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        for(int i= 0;i<deck1.size();i++) {
            if(deck1.size() == 0 || deck2.size() == 0){
                break;
            }
            if (deck1.get(i) > deck2.get(i)) {
                deck1.add(deck1.get(i));
                deck1.add(deck2.get(i));
                deck1.remove(0);
                deck2.remove(i);
            } else if (deck1.get(i) < deck2.get(i)) {
                deck2.add(deck2.get(i));
                deck2.add(deck1.get(i));
                deck1.remove(i);
                deck2.remove(0);
            }
            else{
                deck1.remove(i);
                deck2.remove(i);
            }
            i = -1;
        }
        int sum =0;
        if(deck1.size() > deck2.size()){
            for(int e : deck1){
                sum+=e;
            }
            System.out.print("First player wins! ");
        }
        else{
            for(int e : deck2){
                sum+=e;
            }
            System.out.print("Second player wins! ");
        }
        System.out.println("Sum: "+sum);
    }
}
