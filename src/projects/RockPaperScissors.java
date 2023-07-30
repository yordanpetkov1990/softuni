package projects;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose [r]ock, [p]aper or [s]cissors");
        String playerMove = "";
        String input = scan.nextLine();
        while(!input.equals("end")) {
            boolean isValid = true;
            if (input.equals("rock") || input.equals("r")) {
                playerMove = ROCK;
            } else if (input.equals("paper") || input.equals("p")) {
                playerMove = PAPER;
            } else if (input.equals("scissors") || input.equals("s")) {
                playerMove = SCISSORS;
            } else {
                System.out.println("Invalid input.Please try again!");
                isValid=false;
            }
            if(isValid) {


                Random rnd = new Random();
                int computerRandomNumber = rnd.nextInt(3);
                String computerMove = "";
                switch (computerRandomNumber) {
                    case 0:
                        computerMove = ROCK;
                        break;
                    case 1:
                        computerMove = PAPER;
                        break;
                    case 2:
                        computerMove = SCISSORS;
                        break;

                }
                System.out.println("The computer chose: " + computerMove);
                if (playerMove.equals(ROCK) && computerMove.equals(SCISSORS)
                        || playerMove.equals(SCISSORS) && computerMove.equals(PAPER)
                        || playerMove.equals(PAPER) && computerMove.equals(ROCK)) {
                    System.out.println("You win!");
                } else if (playerMove.equals(computerMove)) {
                    System.out.println("Draw!");
                } else {
                    System.out.println("You lose!");
                }
            }
            input = scan.nextLine();
        }


    }
}
