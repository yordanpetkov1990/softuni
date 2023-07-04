import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int randomComputerNumber = rnd.nextInt(1,101);
        String guess = scan.nextLine();
        while(true) {
            boolean isValid = true;

            for(int i =0;i<guess.length();i++){
                if(guess.charAt(i) <48 || guess.charAt(i) > 57){
                    isValid=false;
                    break;
                }
            }

            if(isValid){
                int number = Integer.valueOf(guess);

                if (number==randomComputerNumber) {
                    System.out.println("You win!");
                    break;
                } else if (number > randomComputerNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }
            }
            else{
                System.out.println("Invalid input.Try again!");
            }

            guess = scan.nextLine();
        }
    }
}
