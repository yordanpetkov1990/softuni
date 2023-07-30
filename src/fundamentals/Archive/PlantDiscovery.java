package fundamentals.Archive;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, HashMap<String,Double>> plantsAndRarity = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] commandParts = scan.nextLine().split("<->");
            String plant = commandParts[0];
            Double rarity = Double.parseDouble(commandParts[1]);
            if(!plantsAndRarity.containsKey(plant)){
                plantsAndRarity.put(plant,new HashMap<>());
                plantsAndRarity.get(plant).put("rarity",rarity);

            }
            else{

                plantsAndRarity.get(plant).put(plant,rarity);
            }
        }
        String input = scan.nextLine();
        while(!input.equals("Exhibition")){
            String[] commandParts = input.split(": ");
            String commandName = commandParts[0];
            switch (commandName){
                case"Rate":
                    String[] commandParts1 = commandParts[1].split(" - ");
                    String plant = commandParts1[0];
                    double rating = Double.parseDouble(commandParts1[1]);
                    if(plantsAndRarity.containsKey(plant)){
                        double oldRating = 0;
                        if(plantsAndRarity.get(plant).get("rating") != null){
                            oldRating =plantsAndRarity.get(plant).get("rating");
                            plantsAndRarity.get(plant).put("rating",(oldRating+rating)/2);
                        }
                        else{
                            plantsAndRarity.get(plant).put("rating",rating);
                        }

                    }
                    break;
                case"Update":
                    String[] commandParts2 = commandParts[1].split(" - ");
                    String planttoUpdate = commandParts2[0];
                    double newRarity = Double.parseDouble(commandParts2[1]);
                    plantsAndRarity.get(planttoUpdate).put("rarity",newRarity);
                    break;
                case"Reset":
                    String plantToReset = commandParts[1];
                    plantsAndRarity.get(plantToReset).put("rating",0.00);
                    break;
            }

            input = scan.nextLine();
        }
        System.out.println("Plants for the exhibition:");

        for(Map.Entry<String,HashMap<String,Double>> entry : plantsAndRarity.entrySet()){
            System.out.printf("- %s; Rarity: %.0f; Rating: %.2f\n",entry.getKey(),entry.getValue().get("rarity"),entry.getValue().get("rating"));
        }
    }
}
