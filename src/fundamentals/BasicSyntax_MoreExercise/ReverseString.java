package fundamentals.BasicSyntax_MoreExercise;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();
        for(int i =x.length()-1;i>=0;i--){
            System.out.print(x.charAt(i));
        }
    }
}
