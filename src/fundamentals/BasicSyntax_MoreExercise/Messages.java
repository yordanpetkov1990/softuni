package fundamentals.BasicSyntax_MoreExercise;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String x = scan.nextLine();
        int length = x.length();
        int maindigit = Integer.parseInt(String.valueOf(x.charAt(0)));
        int offset = (maindigit-2) * 3;
        if(maindigit == 7){
            offset++;
        }
        else if(maindigit == 9){
            offset++;
        }
        int index =offset+length-1;
        System.out.printf("%c",'a' + index);
    }
}
