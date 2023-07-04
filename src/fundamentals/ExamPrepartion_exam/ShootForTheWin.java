package fundamentals.ExamPrepartion_exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scan.nextLine();
        int count = 0;
        while(!input.equals("End")){
            int index = Integer.parseInt(input);
            if(index >= 0 && index <=numbers.size()-1 && numbers.get(index) != -1){
                int value = numbers.get(index);
                numbers.set(index,-1);
                count++;
                for(int i = 0;i<numbers.size();i++){
                    if(numbers.get(i)> value && numbers.get(i) != -1){
                        numbers.set(i,numbers.get(i) - value);
                    }
                    else if (numbers.get(i) <= value && numbers.get(i) != -1){
                        numbers.set(i,numbers.get(i) + value);
                    }
                }


            }
            input = scan.nextLine();
        }
        System.out.print("Shot targets: " + count);
        System.out.print(" -> " + String.join(" ",numbers.toString().replace("[","").replace("]","").replace(",","")));
    }
}
