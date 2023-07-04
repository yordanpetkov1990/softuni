package fundamentals.Arrays_exam;


import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        int count10 = 0;
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split("\\|");
        String input = scan.nextLine();
        while(!input.equals("Yohoho!")){
            if(input.contains("Loot")){
                String[] commandParts = input.split(" ");
                for (int i = 1; i < commandParts.length; i++) {
                    boolean alreadyContained = false;
                    for (int j = 0; j < arr.length; j++) {
                        if (commandParts[i].equals(arr[j])) {
                            alreadyContained = true;
                            break;
                        }
                    }
                    if (!alreadyContained) {
                        String newChest = commandParts[i] + " " + String.join(" ", arr);
                        arr = newChest.split(" ");
                    }
                }
            }
            else if(input.contains("Drop")) {
                String[] parts = input.split(" ");
                int index = Integer.parseInt(parts[1]);
                if (index >= 0 && index < arr.length) {


                    String element = arr[index];
                    for (int i = 0; i < arr.length - 1; i++) {
                        if (i < index) {

                        } else {
                            arr[i] = arr[i + 1];
                        }
                    }
                    arr[arr.length - 1] = element;
                }
            }
            else if(input.contains("Steal")){
                String[] parts = input.split(" ");
                int count = Integer.parseInt(parts[1]);
                count10=count;
                if(count > arr.length){
                    for(int i = 0;i< arr.length;i++){
                        arr[i] = "";
                    }
                }
                else{
                    for(int i = 0 ;i<count;i++){
                        System.out.print(arr[arr.length-count + i]);
                        if(i + 1 != count){
                            System.out.print(", ");
                        }
                        arr[arr.length-count+i] = "";
                    }
                    System.out.println();
                }
            }

            input = scan.nextLine();
        }
        int length = 0 ;
       for(int i = 0;i<arr.length;i++){
           length+=arr[i].length();
       }
       double average = length * 1.0 / (arr.length - count10);
       if(length > 0){
           System.out.printf("Average treasure gain: %.2f pirate credits.\n",average);
       }
       else{
           System.out.println("Failed treasure hunt.");
       }
    }
}
