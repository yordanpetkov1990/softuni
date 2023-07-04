package fundamentals.DataTypesaAndVariables_EXAM;

import java.util.Scanner;

public class WaterOveflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int total = 0;
        for(int i =0;i<n;i++){
            int x = Integer.parseInt(scan.nextLine());
            if(x+total>255){
                System.out.println("Insufficient capacity!");
            }
            else{
                total+=x;
            }

        }
        System.out.println(total);
    }
}
