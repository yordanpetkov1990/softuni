package basics.WhileLoop;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();
        while(!(x.equals("Stop"))){
            System.out.printf("%s\n",x);
            x = scan.nextLine();
        }
    }
}
