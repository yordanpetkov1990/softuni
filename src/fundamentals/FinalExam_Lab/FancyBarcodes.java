package fundamentals.FinalExam_Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = "@[#]+[A-Z][a-zA-Z0-9]{4,}[A-Z]@[#]+";
        Pattern pattern = Pattern.compile(regex);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            String result = "";
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                for (int j = 0; j <input.length() ; j++) {
                    char currentSymbol = input.charAt(j);
                    if(Character.isDigit(currentSymbol)){
                        result+=currentSymbol;
                    }
                }
                if(result.isEmpty()){
                    System.out.println("Product group: 00");
                }
                else{
                    System.out.println("Product group: " +result);
                }
            }else{
                System.out.println("Invalid barcode");
            }
        }
    }
}
