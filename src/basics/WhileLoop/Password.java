package basics.WhileLoop;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        String password = scan.nextLine();
        String x = scan.nextLine();
        while(!(x.equals(password))){
            x = scan.nextLine();
        }
        System.out.printf("Welcome %s!",username);
    }
}
