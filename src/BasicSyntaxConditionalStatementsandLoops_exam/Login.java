package BasicSyntaxConditionalStatementsandLoops_exam;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();
        String password = "";
        for(int i = username.length() - 1;i>=0;i--){
            password+=username.charAt(i);
        }
        String enteredPassword = scan.nextLine();
        int countWrongPassword = 0;
        while(!enteredPassword.equals(password)){
            countWrongPassword++;
            if(countWrongPassword == 4){
                System.out.printf("User %s blocked!",username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scan.nextLine();
        }
        if(enteredPassword.equals(password)){
            System.out.printf("User %s logged in.",username);
        }
    }
}
