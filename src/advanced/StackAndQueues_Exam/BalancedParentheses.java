package advanced.StackAndQueues_Exam;

import java.util.*;
import java.util.stream.Collectors;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());
        String result = isGood(input) ? "YES" : "NO";
        System.out.println(result);


    }

    private static boolean isGood(List<String> input) {
        Deque<String> openingBracketStack = new ArrayDeque<>();
        for (int i = 0; i < input.size(); i++) {
            String currentElement = input.get(i);
            switch (currentElement){

                case "}":
                    if(openingBracketStack.isEmpty()){
                        return false;
                    }
                    String opening1 = openingBracketStack.pop();
                    if(!opening1.equals("{")){
                        return false;
                    }
                    break;
                case "]":
                    if(openingBracketStack.isEmpty()){
                        return false;
                    }
                    String opening2 = openingBracketStack.pop();
                    if(!opening2.equals("[")){
                        return false;
                    }
                    break;
                case ")":
                    if(openingBracketStack.isEmpty()){
                        return false;
                    }
                    String opening3 = openingBracketStack.pop();
                    if(!opening3.equals("(")){
                        return false;
                    }
                    break;
                default:
                    openingBracketStack.push(currentElement);
                    break;
            }
        }
        return openingBracketStack.isEmpty();
    }
}
