package fundamentals.Arrays_exam;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String input = scan.nextLine();
        while(!input.equals("end")){
            String[] commandParts = input.split(" ");
            String commandName = commandParts[0];
            switch (commandName){
                case "swap":
                    int index1 = Integer.parseInt(commandParts[1]);
                    int index2 = Integer.parseInt(commandParts[2]);
                    int firstElement = arr[index1];
                    int lastElement = arr[index2];
                    arr[index1] = lastElement;
                    arr[index2] = firstElement;

                    break;
                case "multiply":
                    int indexToMultiply1 = Integer.parseInt(commandParts[1]);
                    int indexToMultiply2 = Integer.parseInt(commandParts[2]);
                    int product = arr[indexToMultiply1] * arr[indexToMultiply2];
                    arr[indexToMultiply1] = product;

                    break;
                case "decrease":
                    for(int i =0;i<arr.length;i++){
                        arr[i]--;
                    }
                    break;
            }
            input = scan.nextLine();
        }
        for(int i = 0;i<arr.length;i++){
            if(i == arr.length-1){
                System.out.print(arr[i]);
            }
            else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
