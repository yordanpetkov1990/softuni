package fundamentals.Methods_exam;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();
        if(x.length() % 2 == 0){
                int firstIndex = x.length() / 2 - 1;
                int secondIndex = x.length() / 2 ;
            System.out.printf("%c%c\n",x.charAt(firstIndex),x.charAt(secondIndex));
        }
        else {
            int index = x.length() / 2;
            System.out.printf("%c\n",x.charAt(index));
        }
    }
}
