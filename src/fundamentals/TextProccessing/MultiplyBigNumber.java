package fundamentals.TextProccessing;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger num1 = new BigInteger(scan.nextLine());
        BigInteger num2 = new BigInteger(scan.nextLine());

        BigInteger product = num1.multiply(num2);
        System.out.println(product.toString());
    }
}
