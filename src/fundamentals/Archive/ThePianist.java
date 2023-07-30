package fundamentals.Archive;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, ArrayList<String>> pieces = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] commandParts1 = scan.nextLine().split("\\|");
            String composer = commandParts1[1];
            String piece = commandParts1[0];
            String key = commandParts1[2];
            pieces.put(piece,new ArrayList<>());
            pieces.get(piece).add(composer);
            pieces.get(piece).add(key);
        }
        String input = scan.nextLine();
        while(!input.equals("Stop")){
            String[] commandParts2 = input.split("\\|");
            String commandName = commandParts2[0];
            switch (commandName){
                case "Add":
                    String composer = commandParts2[2];
                    String piece = commandParts2[1];
                    String key = commandParts2[3];
                    if(!pieces.containsKey(piece)){
                        pieces.put(piece,new ArrayList<>());
                        pieces.get(piece).add(composer);
                        pieces.get(piece).add(key);
                        System.out.printf("%s by %s in %s added to the collection!\n",piece,composer,key);
                    }
                    else{
                        System.out.printf("%s is already in the collection!\n",piece);
                    }
                    break;
                case "Remove":
                    String piece2 = commandParts2[1];
                    if(!pieces.containsKey(piece2)){
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n",piece2);
                    }
                    else{
                        System.out.printf("Successfully removed %s!\n",piece2);
                        pieces.remove(piece2);
                    }
                    break;
                case "ChangeKey":
                    String piece3 = commandParts2[1];
                    String newkey = commandParts2[2];
                    if(pieces.containsKey(piece3)){
                        pieces.get(piece3).set(1,newkey);
                        System.out.printf("Changed the key of %s to %s!\n",piece3,newkey);
                    }
                    else{
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n",piece3);
                    }
                    break;

            }
            input = scan.nextLine();
        }
        for(Map.Entry<String,ArrayList<String>> entry:pieces.entrySet()){
            System.out.printf("%s -> Composer: %s, Key: %s\n",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1));
        }

    }
}
