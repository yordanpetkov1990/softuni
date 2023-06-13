package DataTypesaAndVariables_EXAM;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int p = Integer.parseInt(scan.nextLine());
        int count = n/p;
        if(n%p !=0){
            count++;
        }
        System.out.println(count);

    }
}
