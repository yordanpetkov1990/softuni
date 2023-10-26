package advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class AddVat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] doubles = Arrays.stream(scan.nextLine().split(", ")).mapToDouble(Double::parseDouble).toArray();
        UnaryOperator<Double> addVat = aDouble -> aDouble * 1.2;
        System.out.println("Prices with VAT:");
        for (double x : doubles) {
            System.out.printf("%.2f\n",addVat.apply(x));
        }
    }
}
