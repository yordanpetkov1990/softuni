package fundamentals.BasicSyntax_MoreExercise;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double balance = Double.parseDouble(scan.nextLine());
        double startBalance = balance;

        String input = scan.nextLine();
        while(!input.equals("Game Time")){
            switch (input){
                case "OutFall 4":
                    if(balance>=39.99){
                        balance-=39.99;
                        System.out.println("Bought OutFall 4");
                        break;
                    }else{
                        System.out.println("Too Expensive");
                        break;
                    }

                case "CS: OG":
                    if(balance >=15.99){
                        balance-=15.99;
                        System.out.println("Bought CS: OG");
                        break;
                    }else{
                        System.out.println("Too Expensive");
                        break;
                    }

                case "Zplinter Zell":
                    if(balance >=19.99){
                        balance-=19.99;
                        System.out.println("Bought Zplinter Zell");
                        break;
                    }else{
                        System.out.println("Too Expensive");
                        break;
                    }

                case "Honored 2":
                    if(balance >=59.99){
                        balance-=59.99;
                        System.out.println("Bought Honored 2");
                        break;
                    }else{
                        System.out.println("Too Expensive");
                        break;
                    }

                case "RoverWatch":
                    if(balance>=29.99){
                        balance-=29.99;
                        System.out.println("Bought RoverWatch");
                        break;
                    }else{
                        System.out.println("Too Expensive");
                        break;
                    }

                case "RoverWatch Origins Edition":
                    if(balance>=39.99){
                        balance-=39.99;
                        System.out.println("Bought RoverWatch Origins Edition");
                        break;
                    }else{
                        System.out.println("Too Expensive");
                        break;
                    }

                default:
                    System.out.println("Not Found");
                    break;
            }
            if(balance <= 0){
                System.out.println("Out of money!");
                return;
            }
            input = scan.nextLine();
        }
        System.out.printf("Total spent: $%.2f. ",startBalance-balance);
        System.out.printf("Remaining: $%.2f",balance);

    }
}
