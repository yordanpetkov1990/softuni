package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> printerqueue = new ArrayDeque<>();
        String command = scan.nextLine();
        while(!command.equals("print")){
            if(!command.equals("cancel")){
                printerqueue.offer(command);
            }else{
                if(printerqueue.isEmpty()){
                    System.out.println("Printer is on standby");
                }else{
                    String x = printerqueue.poll();
                    System.out.println("Canceled " + x);
                }
            }


            command = scan.nextLine();
        }
        for (String s:
            printerqueue ) {
            System.out.println(s);
        }
    }
}
