package fundamentals.StreamAPI_exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, ArrayList<Double>> products = new LinkedHashMap<>();
        String input = scan.nextLine();
        while(!input.equals("buy")){
            String[] commandParts = input.split(" ");
            String nameOfProduct = commandParts[0];
            double price = Double.parseDouble(commandParts[1]);
            double quantity = Double.parseDouble(commandParts[2]);
            if(!products.containsKey(nameOfProduct)){
                products.put(nameOfProduct,new ArrayList<>());
                products.get(nameOfProduct).add(price);
                products.get(nameOfProduct).add(quantity);
            }else{
               products.get(nameOfProduct).set(0,price);
               products.get(nameOfProduct).set(1,products.get(nameOfProduct).get(1) +quantity);
            }


            input = scan.nextLine();
        }
        for(Map.Entry<String,ArrayList<Double>> entry:products.entrySet()){
            System.out.printf("%s -> %.2f\n",entry.getKey(),entry.getValue().get(0) * entry.getValue().get(1));
        }
    }
}
