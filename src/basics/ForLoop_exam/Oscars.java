package basics.ForLoop_exam;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String actor = scan.nextLine();
        double points = Double.parseDouble(scan.nextLine());
        int kvestor = Integer.parseInt(scan.nextLine());
        for(int i =0;i<kvestor;i++){
            String name = scan.nextLine();
            double pointe = Double.parseDouble(scan.nextLine());
            points+=(name.length() * pointe) / 2;
            if(points >= 1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",actor,points);
                return;
            }
        }
        if(points<=1250.5){
            System.out.printf("Sorry, %s you need %.1f more!",actor,1250.5-points);
        }

    }
}
