package fundamentals.StreamAPI_exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> materials = new LinkedHashMap<>() {{
            put("shards", 0);
            put("fragments", 0);
            put("motes", 0);
        }};
        Map<String, Integer> junk = new LinkedHashMap<>();
        boolean isValid = false;

        while (!isValid) {

            String[] input = scan.nextLine().split("\\s+");

            for (int i = 0; i < input.length; i += 2) {

                String key = input[i + 1].toLowerCase();
                int value = Integer.parseInt(input[i]);

                if (key.equals("shards") || key.equals("fragments") || key.equals("motes")) {
                    materials.put(key, materials.get(key) + value);

                    if (materials.get(key) >= 250) {
                        materials.put(key, materials.get(key) - 250);

                        if (key.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (key.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else {
                            System.out.println("Dragonwrath obtained!");
                        }
                        isValid = true;
                        break;
                    }
                } else {
                    junk.put(key, !junk.containsKey(key) ? value : junk.get(key) + value);
                }
            }
        }

        for(Map.Entry<String,Integer> entry:materials.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        junk.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));
    }
}


