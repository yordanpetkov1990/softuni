package fundamentals.FInalExam;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String command = scan.nextLine();
        while(!command.equals("Finish")){
            String[] tokens = command.split(" ");
            String commandName = tokens[0];
            switch (commandName){
                case "Replace":
                    String old = tokens[1];
                    String newString = tokens[2];
                    input = input.replace(old,newString);
                    System.out.println(input);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    if(startIndex >=0 && endIndex <=input.length()-1){
                        String start = input.substring(0,startIndex);
                        String end = input.substring(endIndex+1,input.length());
                        input = start + end;
                        System.out.println(input);
                    }
                    else{
                        System.out.println("Invalid indices!");
                    }
                    break;
                case "Make":
                    String type = tokens[1];
                    if(type.equals("Upper")){
                        input = input.toUpperCase();
                    }else if(type.equals("Lower")){
                        input =input.toLowerCase();
                    }
                    System.out.println(input);
                    break;
                case "Check":
                    String check = tokens[1];
                    if(input.contains(check)){
                        System.out.printf("Message contains %s\n",check);
                    }
                    else{
                        System.out.printf("Message doesn't contain %s\n",check);
                    }
                    break;
                case "Sum":
                    int startIndexToSum = Integer.parseInt(tokens[1]);
                    int endIndextoSum = Integer.parseInt(tokens[2]);
                    int result = 0;

                    if(startIndexToSum >= 0 && endIndextoSum <= input.length()-1){
                            String sum = input.substring(startIndexToSum,endIndextoSum+1);
                            for(char c:sum.toCharArray()){
                                result+=(int) c;
                            }
                        System.out.println(result);
                    }else{
                        System.out.println("Invalid indices!");
                    }
                    break;
            }

            command = scan.nextLine();
        }
    }
}
