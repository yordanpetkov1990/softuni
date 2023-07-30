package fundamentals.TextProccessing;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strArr = scan.nextLine().split(" ");
        System.out.println(method(strArr[0],strArr[1]));

    }
    public static int method(String str1,String str2){
        int sum = 0;
        if(str1.length() > str2.length()){
            for (int i = 0; i < str2.length(); i++) {
                sum= sum + str1.charAt(i) * str2.charAt(i);
            }
            for (int i = str2.length(); i < str1.length(); i++) {
                sum+=str1.charAt(i);
            }
        }
        else {
            for (int i = 0; i < str1.length(); i++) {
                sum= sum + str1.charAt(i) * str2.charAt(i);
            }
            for (int i = str1.length(); i < str2.length(); i++) {
                sum+=str2.charAt(i);
            }
        }
        return sum;
    }
}
