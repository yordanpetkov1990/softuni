package advanced.FunctionalProgrammingExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] numbs = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Predicate<Integer>> predicateList = createPredicateList(numbs);
        for (int i = 1; i <=n ; i++) {
            if(check(i,predicateList)){
                System.out.print(i + " ");
            }
        }
    }

    private static boolean check(int i, List<Predicate<Integer>> predicateList) {
        boolean isGood = true;
        for (Predicate<Integer> integerPredicate : predicateList) {
            if(!integerPredicate.test(i)){
                isGood=false;
                break;
            }
        }
        return isGood;
    }

    private static List<Predicate<Integer>> createPredicateList(int[] numbs) {
        List<Predicate<Integer>> predicateList= new ArrayList<>();
        for (int numb : numbs) {
            if(numb == 0){
                continue;
            }
            Predicate<Integer> integerPredicate = x -> x % numb == 0;
            predicateList.add(integerPredicate);
        }
        return predicateList;
    }

}
  //  List<Integer> divideNumbers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
//        Predicate<Integer> check = x -> {
//            for (Integer divideNumber : divideNumbers) {
//                if (divideNumber == 0) {
//                    continue;
//                }if(x % divideNumber != 0){
//                    return false;
//                }
//
//            }
//            return true;
//        };
//        for (int i = 1; i <= n; i++) {
//            if(check.test(i)){
//                System.out.print(i + " ");
//            }
//        }




