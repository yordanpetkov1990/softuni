package fundamentals.TextProccessing;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalStrength = 0;
        StringBuilder result = new StringBuilder(scan.nextLine());
        for (int position = 0; position <= result.length()-1; position++) {
            char currentSymbol = result.charAt(position);
            char nextSymbol = result.charAt(position+1);


            if(currentSymbol == '>'){
                int explosionStrength = Integer.parseInt(nextSymbol + "");
                totalStrength+=explosionStrength;
            } else if( currentSymbol != '>' && totalStrength > 0){
                result.deleteCharAt(position);
                totalStrength--;
                position--;
            }

        }
        System.out.println(result);

    }
}
