package fundamentals.MapsLambdaAndStreamAPILab;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words = Arrays.stream(scan.nextLine().split(" ")).filter(w -> w.length() % 2 == 0).toArray(String[]::new);
        for(String word:words){
            System.out.println(word);
        }
    }
}
