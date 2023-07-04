package fundamentals.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Gauss_Trick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int count = numbers.size() / 2;
        for(int i = 0;i<count;i++){
            int firstElement = numbers.get(i);
            int lastElement = numbers.get(numbers.size()-1);
            numbers.set(i,firstElement+lastElement);
            numbers.remove(numbers.size()-1);
        }
        for(int e:numbers){
            System.out.print(e + " ");
        }

    }
}
