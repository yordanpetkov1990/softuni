package fundamentals.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List<Integer> result = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        result.removeIf(n -> n<0);
        if(result.size() == 0){
            System.out.println("empty");
        }
        else{
            for(int i = result.size()-1;i>=0;i--){
                System.out.print(result.get(i) + " ");
            }
        }
    }
}
