package fundamentals.List_exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scan.nextLine();
        while(!input.equals("End")){
            String[] commandParts = input.split(" ");
            String commandName = commandParts[0];
            switch (commandName){
                case "Add":
                    int numberToAdd = Integer.parseInt(commandParts[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(commandParts[1]);
                    int indexToInsert = Integer.parseInt(commandParts[2]);
                    if(indexToInsert < 0 ||indexToInsert >= numbers.size()){
                        System.out.println("Invalid index");
                        break;
                    }
                    numbers.add(indexToInsert,numberToInsert);
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(commandParts[1]);
                    if(indexToRemove < 0 ||indexToRemove >= numbers.size()){
                        System.out.println("Invalid index");
                        break;
                    }
                    numbers.remove(indexToRemove);
                    break;
                case "Shift":
                    int count = Integer.parseInt(commandParts[2]);
                    if(input.contains("left")){
                        for(int y = 0;y<count;y++) {
                            int firstNumber = numbers.get(0);
                            for (int i = 0; i < numbers.size() - 1; i++) {
                                int nextElement = numbers.get(i + 1);
                                numbers.set(i, nextElement);
                            }
                            numbers.set(numbers.size() - 1, firstNumber);
                        }
                    }else{
                        for(int y = 0;y<count;y++) {
                            int lastNumber = numbers.get(numbers.size()-1);
                            for (int i = numbers.size()-1; i>0; i--) {
                                int previousElement = numbers.get(i-1);
                                numbers.set(i, previousElement);
                            }
                            numbers.set(0, lastNumber);
                        }
                    }

                    break;
            }


            input =scan.nextLine();
        }
        for(int e:numbers){
            System.out.print(e + " ");
        }
    }
}
