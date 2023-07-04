package fundamentals.MidExam;

import java.util.*;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> coffeeList = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
        int n = Integer.parseInt(scan.nextLine());
        for(int i=0;i<n;i++){
            String[] commandParts = scan.nextLine().split(" ");
            String commandName = commandParts[0];
            switch (commandName){
                case "Include":
                    String coffeToInclude = commandParts[1];
                    coffeeList.add(coffeToInclude);
                    break;
                case "Remove":
                    String depend = commandParts[1];
                    int numberOfCoffes = Integer.parseInt(commandParts[2]);
                    if(numberOfCoffes>coffeeList.size()){
                        break;
                    }
                    else{
                        if(depend.equals("first")){
                            for(int y = numberOfCoffes-1;y>=0;y--){
                                coffeeList.remove(y);

                            }
                        }
                        else if(depend.equals("last")){
                            int count = 0;
                            for(int y = coffeeList.size()-1;y>=0;y--){
                                if(count==numberOfCoffes){
                                    break;
                                }
                                coffeeList.remove(y);
                                count++;
                            }
                        }
                    }
                    break;
                case "Prefer":
                    int index1 = Integer.parseInt(commandParts[1]);
                    int index2 = Integer.parseInt(commandParts[2]);
                    if((index1 >= 0 && index1 <=coffeeList.size()-1) && (index2 >= 0 && index2 <=coffeeList.size()-1)){
                        String value1 = coffeeList.get(index1);
                        String value2 = coffeeList.get(index2);
                        coffeeList.set(index1,value2);
                        coffeeList.set(index2,value1);
                    }

                    break;
                case "Reverse":
                    Collections.reverse(coffeeList);
                    break;
            }

        }
        System.out.println("Coffees:\n"+ String.join(" ",coffeeList));

    }
}
