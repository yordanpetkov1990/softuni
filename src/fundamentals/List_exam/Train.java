package fundamentals.List_exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        while(!input.equals("end")){
            String[] commandParts = input.split(" ");
            if(input.contains("Add")){
                int number = Integer.parseInt(commandParts[1]);
                numbers.add(number);
            }
            else {
                int passengers = Integer.parseInt(input);
                for(int i =0;i<numbers.size();i++){
                    int oldValue = numbers.get(i);
                    if(oldValue + passengers <= maxCapacity ){
                        numbers.set(i,oldValue+passengers);
                        break;
                    }
                }
            }
            input = scan.nextLine();
        }
        for(int e:numbers){
            System.out.print(e + " ");
        }
    }
}
