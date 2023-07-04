package fundamentals.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers1 = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numbers2 = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
        if(numbers2.size() < numbers1.size()) {
            for (int i = 0; i < numbers2.size(); i++) {
                result.add(numbers1.get(i));
                result.add(numbers2.get(i));
            }
            for(int i = numbers2.size();i<numbers1.size();i++){
                result.add(numbers1.get(i));
            }
        }else{
            for (int i = 0; i < numbers1.size(); i++) {
                result.add(numbers1.get(i));
                result.add(numbers2.get(i));
            }
            for(int i = numbers1.size();i<numbers2.size();i++){
                result.add(numbers2.get(i));
            }
        }
        for(int e:result){
            System.out.print(e + " ");
        }

    }
}
