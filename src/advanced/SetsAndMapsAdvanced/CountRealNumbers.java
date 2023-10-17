package advanced.SetsAndMapsAdvanced;

import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Map<Double,Integer> ocurrencies = new LinkedHashMap<>();
        Scanner scan = new Scanner(System.in);
        double[] elements = Arrays.stream(scan.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        for (int i = 0; i < elements.length; i++) {
            double currentElement = elements[i];
            ocurrencies.putIfAbsent(currentElement,0);
            ocurrencies.put(currentElement,ocurrencies.get(currentElement) + 1);
        }
        for (Map.Entry<Double, Integer> entry : ocurrencies.entrySet()) {
            System.out.printf("%.1f -> %d\n",entry.getKey(),entry.getValue());
        }
    }
}
