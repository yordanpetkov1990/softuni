package advanced.SetsAndMapsAdvanced;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String,List<Double>> record = new TreeMap<>();
        DecimalFormat decimalFormat = new DecimalFormat("#.###################");

        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            List<Double> collect = Arrays.stream(scan.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
            record.put(name,collect);
        }
        for (var x : record.entrySet()) {
            List<Double> values = x.getValue();
            double average = 0;
            for (Double value : values) {
                average+=value;
            }
            average/=values.size();
            System.out.printf("%s is graduated with " +decimalFormat.format(average) + "\n",x.getKey());
        }
    }
}
