package fundamentals.ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> shoppingList = Arrays.stream(scan.nextLine().split("!")).collect(Collectors.toList());
        String input = scan.nextLine();
        while(!input.equals("Go Shopping!")){
            String[] commandParts = input.split(" ");
            String commandName = commandParts[0];
            String item = commandParts[1];
            switch (commandName){
                case "Urgent":
                    if(!shoppingList.contains(item)){
                        shoppingList.add(0,item);
                    }
                    break;
                case "Unnecessary":
                    if(shoppingList.contains(item)){
                        shoppingList.remove(item);
                    }
                    break;
                case "Correct":
                    String newItem = commandParts[2];
                    if(shoppingList.contains(item)){
                        int index = shoppingList.indexOf(item);
                        shoppingList.set(index,newItem);
                    }
                    break;
                case "Rearrange":
                    if(shoppingList.contains(item)){
                        shoppingList.remove(item);
                        shoppingList.add(item);
                    }
                    break;
            }

            input = scan.nextLine();
        }
        System.out.println(String.join(", ",shoppingList));
    }
}
