package fundamentals.List_exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scan.nextLine();
        while(!input.equals("end")) {
            String[] commandParts = input.split(" ");
            String commandName = commandParts[0];
            int element = Integer.parseInt(commandParts[1]);
            switch (commandName) {
                case "Delete":
                    numbers.removeAll(Arrays.asList(element));
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandParts[2]);
                    numbers.add(index,element);
                    break;
            }
            input = scan.nextLine();
        }
        for(int e:numbers){
            System.out.print(e + " ");
        }
    }
}
