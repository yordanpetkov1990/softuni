package fundamentals.Archive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String regex = "([\\=\\/])[A-Z][a-zA-Z]{2,}\\1";
        Pattern pattern = Pattern.compile(regex);
        List<String> destinations = new ArrayList<>();
        Matcher matcher = pattern.matcher(input);
        int travelPoints = 0;
        while (matcher.find()){
            String destination = matcher.group().replace("=","").replace("/","");
            int lenght = destination.length();
            travelPoints+=lenght;
            destinations.add(destination);
        }
        System.out.println("Destinations: " +String.join(", ",destinations));
        System.out.println("Travel Points: " + travelPoints);
    }
}
