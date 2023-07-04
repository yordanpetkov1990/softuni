package fundamentals.DataTypesaAndVariables_EXAM;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int starting_yield = Integer.parseInt(scan.nextLine());

        int count_days = 0;
        int total = 0;

        while(starting_yield>=100){

            count_days++;

            total+=starting_yield;
            if(total > 26){
                total-=26;
            }
            starting_yield-=10;
        }
        System.out.println(count_days);
        if(total > 26){
            System.out.println(total-26);
        }
        else{
            System.out.println(total);
        }
    }
}
