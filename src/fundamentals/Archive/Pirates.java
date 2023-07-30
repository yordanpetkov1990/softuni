package fundamentals.Archive;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Map<String,Integer> cityAndGold = new LinkedHashMap<>();
        Map<String,Integer> cityAndPopulation = new LinkedHashMap<>();
        while(!input.equals("Sail")){
            String[] tokens = input.split("\\|\\|");
            String city = tokens[0];
            int population = Integer.parseInt(tokens[1]);
            int gold = Integer.parseInt(tokens[2]);
            if(!cityAndGold.containsKey(city)){
                cityAndGold.put(city,gold);
                cityAndPopulation.put(city,population);
            }
            else{
                int oldPopulation = cityAndPopulation.get(city);
                int oldGold = cityAndGold.get(city);
                cityAndGold.put(city,oldGold+gold);
                cityAndPopulation.put(city,population+oldPopulation);
            }
            input=scan.nextLine();
        }
        String event = scan.nextLine();
        while(!event.equals("End")){
            String[] commandParts = event.split("=>");
            String commandName = commandParts[0];
            String city = commandParts[1];
            switch (commandName){
                case "Plunder":
                    int people = Integer.parseInt(commandParts[2]);
                    int gold = Integer.parseInt(commandParts[3]);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n",city,gold,people);
                    cityAndGold.put(city,cityAndGold.get(city) - gold);
                    cityAndPopulation.put(city,cityAndPopulation.get(city) - people);
                    if(cityAndGold.get(city) == 0 || cityAndPopulation.get(city) == 0){
                        cityAndGold.remove(city);
                        cityAndPopulation.remove(city);
                        System.out.printf("%s has been wiped off the map!\n",city);
                    }
                    break;
                case "Prosper":
                    int goldToProsper = Integer.parseInt(commandParts[2]);
                    if(goldToProsper < 0){
                        System.out.println("Gold added cannot be a negative number!");
                    }
                    else {
                        cityAndGold.put(city,cityAndGold.get(city) + goldToProsper);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.\n",goldToProsper,city,cityAndGold.get(city));
                    }
                    break;
            }

            event = scan.nextLine();
        }
        if(cityAndGold.isEmpty()){
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
        else{
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n",cityAndGold.size());
            for(Map.Entry<String,Integer> entry : cityAndGold.entrySet()){
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg\n",entry.getKey(),cityAndPopulation.get(entry.getKey()),entry.getValue());
            }
        }
    }
}
