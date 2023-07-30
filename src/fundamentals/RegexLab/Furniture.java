package fundamentals.RegexLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalSum = 0;
        String input = scan.nextLine();
        String regex = ">>(?<name>[A-Za-z]+)<<(?<price>[0-9]+[.]?[0-9]+?)!(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);
        List<String> furnite = new ArrayList<>();

        while(!input.equals("Purchase")){
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                furnite.add(matcher.group("name"));
                double currentPrice = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                totalSum+=currentPrice*quantity;
            }

            input = scan.nextLine();
        }
        System.out.println("Bought furniture: ");
        for(String x:furnite){
            System.out.println(x);
        }
        System.out.println("Total money spend: " + String.format("%.2f",totalSum));
    }
}
