package BasicSyntaxConditionalStatementsandLoops_exam;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lostGames = Integer.parseInt(scan.nextLine());
        double headSetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());

        int brokenHeadSets = 0;
        int brokenMouses = 0;
        int brokenKeyboards = 0;
        int brokenDisplays = 0;

        int count = 0;
        for(int i = 1 ;i<=lostGames;i++){
            boolean valid1 = false;
            boolean valid2 = false;
            if(i % 2 == 0){
                brokenHeadSets++;
                valid1 = true;
            }
            if(i % 3 == 0){
                brokenMouses++;
                valid2 = true;
            }
            if(valid1 && valid2){
                brokenKeyboards++;
                count++;
            }
            if(count == 2){
                brokenDisplays++;
                count = 0;
            }
        }
        double totalCost = headSetPrice * brokenHeadSets + mousePrice * brokenMouses + keyboardPrice * brokenKeyboards + displayPrice * brokenDisplays;
        System.out.printf("Rage expenses: %.2f lv.",totalCost);
    }
}
