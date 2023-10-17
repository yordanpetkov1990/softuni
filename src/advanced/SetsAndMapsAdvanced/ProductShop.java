package advanced.SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, LinkedHashMap<String,Double>> shops = new TreeMap<>();

        String command = scan.nextLine();
        while(!"Revision".equals(command)){

            String[] tokens = command.split(", ");

            String shop = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);

            shops.putIfAbsent(shop,new LinkedHashMap<>());
            shops.get(shop).put(product,price);

            command = scan.nextLine();
        }
        for (Map.Entry<String, LinkedHashMap<String, Double>> x : shops.entrySet()) {
            String currentShop = x.getKey();
            LinkedHashMap<String, Double> products = x.getValue();
            System.out.println(currentShop + "->");
            for (Map.Entry<String, Double> y : products.entrySet()) {
                System.out.printf("Product: %s, Price: %.1f\n",y.getKey(),y.getValue());
            }
        }
    }
}
