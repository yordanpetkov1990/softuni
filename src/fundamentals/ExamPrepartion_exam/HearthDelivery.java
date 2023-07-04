package fundamentals.ExamPrepartion_exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HearthDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> houses = Arrays.stream(scan.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scan.nextLine();
        while(!input.equals("Love!")){
            String[] commandParts = input.split(" ");
            String command = commandParts[0];
            int lengh = Integer.parseInt(commandParts[1]);
            int i = 0;
            for(;i<lengh;i++){
                houses.set(i+lengh,houses.get(i+lengh)-2);
                
            }



            input =scan.nextLine();
        }
    }
}
