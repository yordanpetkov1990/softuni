package fundamentals.RegexLab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String regex = "%(?<name>[A-Z][a-z]+)%[^\\.\\|\\%\\$]*?<(?<product>\\w+)>[^\\.\\|\\%\\$]*?\\|(?<quantity>[0-9]+)\\|[^\\.\\|\\%\\$]*?(?<price>[0-9]+[.]?[0-9]*)\\$";
        Pattern pattern = Pattern.compile(regex);
        double total = 0;
        while(!input.equals("end of shift")){
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                String name = matcher.group("name");
                String product = matcher.group("product");
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));
                System.out.printf("%s: %s - %.2f\n",name,product,quantity*price);
                total+=quantity*price;

            }
            input=scan.nextLine();
        }
        System.out.printf("Total income: %.2f\n",total);
    }
}
