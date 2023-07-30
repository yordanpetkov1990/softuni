package fundamentals.Archive;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        String input = scan.nextLine();
        while(!input.equals("Done")){
            if(input.contains("TakeOdd")){
                String newPassword = "";
                for (int i = 0; i <password.length() ; i++) {
                    char currentSymbol = password.charAt(i);
                    if(i % 2 != 0){
                        newPassword += currentSymbol;
                    }
                }
                password = newPassword;
                System.out.println(password);
            }
            else if(input.contains("Cut")){
                String[] tokens = input.split(" ");
                int index = Integer.parseInt(tokens[1]);
                int length = Integer.parseInt(tokens[2]);
                String subString = password.substring(index,index+length);
                password = password.replaceFirst(subString,"");
                System.out.println(password);

            }
            else if(input.contains("Substitute")){
                String[] tokens = input.split(" ");
                String substring = tokens[1];
                String substitute = tokens[2];
                if(password.contains(substring)){
                    password =password.replace(substring,substitute);
                    System.out.println(password);
                }
                else{
                    System.out.println("Nothing to replace!");
                }
            }
            input=scan.nextLine();
        }
        System.out.println("Your password is: " + password);
    }
}
