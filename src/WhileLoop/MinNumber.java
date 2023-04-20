package WhileLoop;
import java.util.Scanner;
public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int min = Integer.MAX_VALUE;
        while(!input.equals("Stop")){
            int x = Integer.parseInt(input);
            if(x<= min)
            {
                min = x;
            }
            input = scan.nextLine();
        }
        System.out.println(min);
    }
}

