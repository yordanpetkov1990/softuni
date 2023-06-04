package basics.Conditional;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String guess = scan.nextLine();
        String password = "s3cr3t!P@ssw0rd";
        if(guess.equals(password)){
            System.out.println("Welcome");
        }
        else {
            System.out.println("Wrong password!");
        }
    }
}
