package fundamentals.Lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> decimalNumbers = Arrays.stream(scan.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for(int i = 0;i<decimalNumbers.size()-1;i++){
            double firstElement = decimalNumbers.get(i);
            double secondElement = decimalNumbers.get(i+1);
                if(firstElement==secondElement){
                    decimalNumbers.set(i,decimalNumbers.get(i) + decimalNumbers.get(i+1));
                    decimalNumbers.remove(i+1);
                    i = -1;
                }
        }
        DecimalFormat df = new DecimalFormat("0.#");
        for(double e:decimalNumbers){
            System.out.print(df.format(e) + " ");
        }

    }
}
