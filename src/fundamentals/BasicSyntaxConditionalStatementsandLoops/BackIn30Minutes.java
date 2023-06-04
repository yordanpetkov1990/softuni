package fundamentals.BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        int sumMinutes = hours*60 + minutes + 30;

        int resultHours = sumMinutes / 60;
        int resultMin = sumMinutes % 60;

        if(resultHours > 23) {
            resultHours = 0;
        }
        System.out.printf("%d:%02d",resultHours,resultMin);
    }
}
