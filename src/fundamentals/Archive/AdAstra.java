package fundamentals.Archive;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String regex = "([\\#\\|])(?<item>[A-Za-z ]+)\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> items = new ArrayList<>();
        int totalCalories = 0;
        while (matcher.find()){
            String item = matcher.group("item");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));
            totalCalories+=calories;
            items.add(String.format("Item: %s, Best before: %s, Nutrition: %d",item,date,calories));

        }
        int days = totalCalories/2000;
        System.out.println(String.format("You have food to last you for: %d days!",days));
        for(String item:items){
            System.out.println(item);
        }


    }
}
