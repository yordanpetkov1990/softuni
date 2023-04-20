package ForLoop;

import java.util.Scanner;

public class NumbersN_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for(int i = 1;n>=i;n--){
            System.out.printf("%d\n",n);
        }
    }
}
