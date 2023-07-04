package fundamentals.MidExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<String> chat = new ArrayList<>();
        while(!input.equals("end")){
            String[] commandParts = input.split(" ");
            String commandName = commandParts[0];
            String message = commandParts[1];
            switch (commandName){
                case "Chat":
                    if(chat.isEmpty()){
                        chat.add(message);
                    }
                    else{
                        chat.add(message);
                    }

                    break;
                case "Delete":
                    if(chat.contains(message)){
                        chat.remove(message);
                    }
                    break;
                case "Edit":
                    String editedVersion = commandParts[2];
                    if(chat.contains(message)){
                        int index = chat.indexOf(message);
                        chat.set(index,editedVersion);
                    }
                    break;
                case "Pin":
                    if(chat.contains(message)) {
                        int index = chat.indexOf(message);
                        String value = chat.get(index);
                        chat.remove(index);
                        chat.add(value);
                    }
                    break;
                case "Spam":
                    List<String> newchat = new ArrayList<>();
                    for(int i = 1;i<commandParts.length;i++){
                        newchat.add(commandParts[i]);
                    }
                    for(int i =0;i<newchat.size();i++){
                        chat.add(newchat.get(i));
                    }

                    break;
            }
            input=scan.nextLine();
        }
        for(String e :chat){
            System.out.println(e);
        }
    }
}
