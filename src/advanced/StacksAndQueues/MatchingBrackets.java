package advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String expression = scan.nextLine();
        ArrayDeque<Integer> indexes = new ArrayDeque<>();
        for (int i = 0; i <expression.length() ; i++) {
            char currentChar = expression.charAt(i);
            if(currentChar == '('){
                indexes.push(i);
            }else if(currentChar ==')'){
                int startIndex = indexes.pop();
                int lastIndex = i+1;
                String subexpression = expression.substring(startIndex,lastIndex);
                System.out.println(subexpression);
            }
        }
    }
}
