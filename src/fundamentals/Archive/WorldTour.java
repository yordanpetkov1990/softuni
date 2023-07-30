package fundamentals.Archive;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result = scan.nextLine();
        String input = scan.nextLine();
        while(!input.equals("Travel")){
            String[] commandParts = input.split(":");
            String commandName = commandParts[0];
            switch (commandName){
                case "Add Stop":
                    int index = Integer.parseInt(commandParts[1]);
                    String newString = commandParts[2];
                    if(index >=0 && index <=result.length()-1){
                        String substring1 = result.substring(0,index);
                        String substring2 = result.substring(index);
                        result = substring1 + newString + substring2;


                    }


                    System.out.println(result);
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);
                    if((startIndex>=0 && startIndex <=result.length()-1) && (endIndex>=0 && endIndex <=result.length()-1)) {


                        String substring3 = result.substring(0, startIndex);
                        String substring4 = result.substring(endIndex + 1, result.length());
                        result = substring3 + substring4;

                    }


                    System.out.println(result);

                    break;
                case "Switch":
                    String oldString = commandParts[1];
                    String newString1 = commandParts[2];
                    result = result.replace(oldString,newString1);
                    System.out.println(result);
                    break;
            }

            input = scan.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s",result);

    }
}
