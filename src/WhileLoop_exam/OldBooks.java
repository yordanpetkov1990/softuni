package WhileLoop_exam;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String book = scan.nextLine();
        String input = scan.nextLine();
        int sum = 0;
        while(!input.equals(book)){
            sum++;
            if(input.equals("No More Books"))
            {
                System.out.printf("The book you search is not here!\n");
                System.out.printf("You checked %d books.",sum-1);
                return;
            }
            input = scan.nextLine();
        }
        System.out.printf("You checked %d books and found it.",sum);

    }
}
