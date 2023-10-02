package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> kids = new ArrayDeque<>();
        String[] names = scan.nextLine().split(" ");
        Collections.addAll(kids,names);
        int n = Integer.parseInt(scan.nextLine());
        int startingValue = n;
        while(kids.size() > 1){
            while(n>1){
                String currentKid = kids.poll();
                kids.offer(currentKid);
                n--;


            }
            n = startingValue;
            System.out.println("Removed " +kids.poll());
        }
        System.out.println("Last is " +kids.poll());
    }
}
