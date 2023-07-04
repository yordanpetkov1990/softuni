package fundamentals.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> result = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scan.nextLine();
        while(!input.equals("end")){
            String[] commandParts = input.split(" ");
            if(input.contains("Contains")){
                int number = Integer.parseInt(commandParts[1]);
                if(result.contains(number)){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No such number");
                }
            }
            else if(input.contains("even")){
                for(int e:result){
                    if(e % 2 == 0){
                        System.out.print(e + " ");
                    }
                }
                System.out.println();
            }
            else if(input.contains("odd")){
                for(int e:result){
                    if(e % 2 != 0){
                        System.out.print(e + " ");
                    }
                }
                System.out.println();
            }
            else if(input.contains("sum")){
                int sum = 0;
                for(int e:result){
                    sum+=e;
                }
                System.out.println(sum);
            }
            else if(input.contains("Filter")){
                String condition = commandParts[1];
                int number = Integer.parseInt(commandParts[2]);
                if (condition.equals(">=")) {

                    for (int e : result) {
                        if (e >= number) {

                            System.out.print(e + " ");
                        }
                    }
                    System.out.println();
                } else if (condition.equals(">")) {
                    for (int e : result) {
                        if (e > number) {

                            System.out.print(e + " ");
                        }
                    }
                    System.out.println();
                } else if (condition.equals(("<="))) {
                    for (int e : result) {
                        if (e <= number) {

                            System.out.print(e + " ");
                        }
                    }
                    System.out.println();
                } else if (condition.equals("<")) {
                    for (int e : result) {
                        if (e < number) {

                            System.out.print(e + " ");
                        }
                    }
                    System.out.println();
                }
            }

            input= scan.nextLine();
        }
    }
}
