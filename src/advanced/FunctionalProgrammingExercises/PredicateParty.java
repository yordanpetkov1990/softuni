package advanced.FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> people = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
        String command = scan.nextLine();

        while(!command.equals("Party!")){
            String[] tokens = command.split("\\s+");
            switch (tokens[0]){
                case "Remove":
                    if(tokens[1].equals("Length")){
                        people.removeIf(e -> e.length() == Integer.parseInt(tokens[2]));
                    }else if(tokens[1].equals("StartsWith")){
                        people.removeIf(e -> e.startsWith(tokens[2]));
                    }else if(tokens[1].equals("EndsWith")){
                        people.removeIf(e -> e.endsWith(tokens[2]));
                    }
                    break;
                case "Double":
                    if(tokens[1].equals("Length")){
                        people.addAll(people.stream().filter(e -> e.length() == Integer.parseInt(tokens[2])).collect(Collectors.toList()));
                    }else if(tokens[1].equals("StartsWith")){
                        people.addAll(people.stream().filter(e -> e.startsWith(tokens[2])).collect(Collectors.toList()));
                    }else if(tokens[1].equals("EndsWith")){
                        people.addAll(people.stream().filter(e -> e.endsWith(tokens[2])).collect(Collectors.toList()));
                    }

                    break;
            }


            command = scan.nextLine();
        }
        Collections.sort(people);
        String collect = people.stream().collect(Collectors.joining(", "));
        if (people.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        }else{
            System.out.println(collect + " are going to the party!");
        }
    }
}
