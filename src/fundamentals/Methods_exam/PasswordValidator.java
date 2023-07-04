package fundamentals.Methods_exam;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        boolean isValid = false;
        if(passwordLen(password)){
            isValid=true;
        }
        else{
            isValid=false;
        }
        if(passwordConsist(password)){
            isValid=true;
        }
        else{
            isValid=false;
        }
        if(passwordDigits(password)){
            isValid=true;
        }
        else{
            isValid=false;
        }
        if(isValid){
            System.out.println("Password is valid");
        }


    }
    public static boolean passwordLen(String password){
        int len = password.length();

        if(len >= 6 &&  len <= 10){
            return true;
        }
        else{
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
    }
    public static boolean passwordConsist(String password){
        boolean isValid = true;
        for(int i =0;i<password.length();i++){
            char currentChar = password.charAt(i);

            if ((currentChar >= 48 && currentChar <= 57) || (currentChar >= 65 && currentChar <= 90) || (currentChar >= 97 && currentChar <= 122)) {

                continue;
            }
            else{
                isValid = false;
                break;
            }
        }
        if(!isValid){
            System.out.println("Password must consist only of letters and digits");
            return false;
        }
        else{
            return true;
        }
    }
    public static boolean passwordDigits(String password){
        int count = 0;
        for(int i = 0;i<password.length();i++){
            char currentSymbol = password.charAt(i);
            if(currentSymbol >= 48 && currentSymbol <= 57){
                count++;
            }
        }
        if(count < 2){
            System.out.println("Password must have at least 2 digits");
            return false;
        }
        else{
            return true;
        }


    }
}
