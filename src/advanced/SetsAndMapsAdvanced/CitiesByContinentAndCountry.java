package advanced.SetsAndMapsAdvanced;

import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, LinkedHashMap<String, List<String>>> continentsAndCountriesAndCities = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split(" ");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            continentsAndCountriesAndCities.putIfAbsent(continent,new LinkedHashMap<>());
            continentsAndCountriesAndCities.get(continent).putIfAbsent(country,new ArrayList<>());
            continentsAndCountriesAndCities.get(continent).get(country).add(city);
        }

        for (var x: continentsAndCountriesAndCities.entrySet()) {
            String continent = x.getKey();
            System.out.println(continent+ ":");
            LinkedHashMap<String, List<String>> countriesAndCities = x.getValue();
            for (var y : countriesAndCities.entrySet()) {
                String country = y.getKey();
                System.out.printf(" %s -> ",country);
                List<String> cities = y.getValue();
                String joinedCities = String.join(", ", cities);
                System.out.printf("%s",joinedCities);
                System.out.println();

            }

        }
    }
}
