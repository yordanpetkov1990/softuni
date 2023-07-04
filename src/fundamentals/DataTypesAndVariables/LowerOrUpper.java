package fundamentals.DataTypesAndVariables;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char x = scan.nextLine().charAt(0);
        if(x >= 65 && x <=90){
            System.out.println("upper-case");
        }
        else if(x >= 97 && x<=122){
            System.out.println("lower-case");
        }
    }
}
