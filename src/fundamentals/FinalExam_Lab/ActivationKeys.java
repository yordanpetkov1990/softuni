package fundamentals.FinalExam_Lab;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();

        String command = scanner.nextLine();
        while(!command.equals("Generate")){
            String[] tokens = command.split(">>>");
            String commandName = tokens[0];
            switch (commandName){
                case "Contains":
                    String subString = tokens[1];
                    if(activationKey.contains(subString)){
                        System.out.printf("%s contains %s\n",activationKey,subString);
                    }
                    else{
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String type = tokens[1];
                    int startIndex = Integer.parseInt(tokens[2]);
                    int endIndex = Integer.parseInt(tokens[3]);
                    String subStringToFlip = activationKey.substring(startIndex,endIndex);
                    String start = activationKey.substring(0,startIndex);
                    String end = activationKey.substring(endIndex,activationKey.length());
                    if(type.equals("Upper")){
                       subStringToFlip = subStringToFlip.toUpperCase();
                    }
                    else{
                        subStringToFlip =subStringToFlip.toLowerCase();
                    }
                    activationKey = start+subStringToFlip+end;
                    System.out.println(activationKey);
                    break;
                case "Slice":
                    int startIndexToSlice = Integer.parseInt(tokens[1]);
                    int endIndextoSlice = Integer.parseInt(tokens[2]);
                    activationKey =activationKey.replace(activationKey.substring(startIndexToSlice,endIndextoSlice),"");
                    System.out.println(activationKey);
                    break;
            }


            command = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s\n",activationKey);
    }
}
