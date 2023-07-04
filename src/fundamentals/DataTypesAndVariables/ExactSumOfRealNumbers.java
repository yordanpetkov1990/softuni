package fundamentals.DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        BigDecimal number = new BigDecimal(0);
        for(int i=0;i<n;i++){
            BigDecimal currentNum = new BigDecimal(scan.nextLine());
            number = number.add(currentNum);

        }
        System.out.println(number);
    }
}
