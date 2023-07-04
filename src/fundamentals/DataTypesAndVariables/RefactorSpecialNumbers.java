package fundamentals.DataTypesAndVariables;
import java.util.Scanner;
public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int currentNum = 0;
        boolean isSpecial = false;
        for (int i = 1; i <= num; i++) {
            currentNum = i;
            while (currentNum > 0) {
                sum += currentNum % 10;
                currentNum = currentNum / 10;
            }
            isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            String value = String.valueOf(isSpecial);
            String result = value.substring(0,1).toUpperCase() + value.substring(1);
            System.out.printf("%d -> %s%n", i, result);
            sum = 0;
        }

    }
}
