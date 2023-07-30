package fundamentals.StreamAPI_exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        LinkedHashMap<String,Integer> resouscesCount = new LinkedHashMap<>();
        while(!input.equals("stop")){
            int quantity = Integer.parseInt(scan.nextLine());
            if(!resouscesCount.containsKey(input)){
                resouscesCount.put(input,quantity);
            }
            else{
                resouscesCount.put(input,resouscesCount.get(input) + quantity);
            }

            input=scan.nextLine();
        }
        for(Map.Entry<String,Integer> entry:resouscesCount.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
