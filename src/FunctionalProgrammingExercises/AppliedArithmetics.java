package FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> collect = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scan.nextLine();
        while (!command.equals("end")){
            if(command.equals("print")){
                collect.forEach(e -> System.out.print(e + " "));
                System.out.println();
            }

            Function<List<Integer>,List<Integer>> arithmetics = createNewFunction(command);
            if(arithmetics != null){
                collect = arithmetics.apply(collect);
            }


            command = scan.nextLine();
        }
    }

    private static Function<List<Integer>, List<Integer>> createNewFunction(String command) {
        if(command.equals("add")){
            return l -> l.stream().map(e -> e+1).collect(Collectors.toList());
        }else if(command.equals("multiply")){
            return l -> l.stream().map(e -> e*2).collect(Collectors.toList());
        }else if(command.equals("subtract")){
            return l -> l.stream().map(e -> e-1).collect(Collectors.toList());
        }
        return null;
    }
}
