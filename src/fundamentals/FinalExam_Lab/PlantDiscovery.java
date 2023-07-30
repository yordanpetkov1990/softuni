package fundamentals.FinalExam_Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String,Integer> plantsAndRarityMap = new LinkedHashMap<>();
        Map<String,Double> rating = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split("<->");
            String plant = tokens[0];
            int rarity = Integer.parseInt(tokens[1]);
            plantsAndRarityMap.put(plant,rarity);
            rating.put(plant,0.00);
        }
        String command = scan.nextLine();
        while(!command.equals("Exhibition")){
            String[] tokens = command.split(": ");
            String commandName = tokens[0];
            String[] tokens2 = tokens[1].split(" - ");
            String plant = tokens2[0];
            boolean isValid = commandName.equals("Rate") ||commandName.equals("Reset") || commandName.equals("Update");
            if(!plantsAndRarityMap.containsKey(plant) ||!isValid){
                System.out.println("error");
            }
            else{
                switch (commandName){
                    case"Rate":
                        double newRating = Double.parseDouble(tokens2[1]);
                        if(rating.containsKey(plant)){
                            if(rating.get(plant) != 0){
                                double oldValue = rating.get(plant);
                                rating.put(plant,(oldValue+newRating)/2);
                            }
                            else{
                                rating.put(plant,newRating);
                            }
                        }
                        break;
                    case"Update":
                        int newRarity = Integer.parseInt(tokens2[1]);
                        plantsAndRarityMap.put(plant,newRarity);
                        break;
                    case"Reset":
                        rating.put(plant,0.00);
                        break;
                }
            }

            command=scan.nextLine();
        }
        System.out.println("Plants for the exhibition:");
    for(Map.Entry<String,Integer> entry:plantsAndRarityMap.entrySet()){
        System.out.printf("- %s; Rarity: %d; Rating: %.2f\n",entry.getKey(),entry.getValue(),rating.get(entry.getKey()));
        }
    }
}
