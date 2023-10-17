package advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        ArrayDeque<String> history = new ArrayDeque<>();
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        while (!command.equals("Home")){
            if(command.equals("back")){
                //
                if(history.size()<2){
                    System.out.println("no previous URLs");
                }else{
                    String currentURL = history.pop();
                    String previousURL= history.peek();
                    System.out.println(previousURL);
                }
            }else{
                System.out.println(command);
                history.push(command);
            }
            command = scan.nextLine();
        }


    }
}
