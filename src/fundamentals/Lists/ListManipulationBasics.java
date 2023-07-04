package fundamentals.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> result = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scan.nextLine();
        while(!input.equals("end")){
            String[] commandParts = input.split(" ");
            String commandName = commandParts[0];
            switch (commandName){
                case "Add":
                    int number = Integer.parseInt(commandParts[1]);
                    result.add(number);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(commandParts[1]);
                    result.remove(Integer.valueOf(numberToRemove));
                    break;
                case "RemoveAt":
                    int index = Integer.parseInt(commandParts[1]);
                    result.remove(index);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(commandParts[1]);
                    int indexToInsert = Integer.parseInt(commandParts[2]);
                    result.add(indexToInsert,numberToInsert);
                    break;
            }
            input = scan.nextLine();
        }
        for(int e :result){
            System.out.print(e + " ");
        }
    }
}
