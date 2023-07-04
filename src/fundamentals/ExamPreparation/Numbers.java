package fundamentals.ExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>();
        int sum = 0;
        for (int e : numbers) {
            sum += e;
        }
        double average = sum * 1.0 / numbers.size();
        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) > average) {
                resultList.add(numbers.get(i));
            }
        }
        Collections.sort(resultList);
        Collections.reverse(resultList);
        if (resultList.isEmpty()) {
                System.out.println("No");
        } else if(resultList.size() < 5 && resultList.size() > 1) {
            for(int e :resultList){
                System.out.print(e + " ");
            }

        }else {
            resultList = resultList.stream().limit(5).collect(Collectors.toList());
           for(int e:resultList){
               System.out.print(e + " ");
           }
        }



        }
    }


