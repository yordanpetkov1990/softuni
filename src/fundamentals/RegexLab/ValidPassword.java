package fundamentals.RegexLab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =Integer.parseInt(scan.nextLine());
        String regex = "_[.]+[A-Z][A-Za-z0-9]{4,}[A-Z]_[.]+";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String password = scan.nextLine();
            Matcher matcher = pattern.matcher(password);
            if(matcher.find()){
                System.out.println("Group: " + checkString(matcher.group()));
            }
            else{
                System.out.println("Invalid pass!");
            }

        }
    }
    public static String checkString(String x){
        String result = "";
        boolean isFound = false;
        for (int i = 0; i <x.length() ; i++) {
            char currentSymbol = x.charAt(i);
            if(Character.isDigit(currentSymbol)){
                isFound=true;
                result+=currentSymbol;
            }
        }
        if(isFound){
            return result;
        }
        return "default";
    }
}
