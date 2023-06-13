package DataTypesaAndVariables_EXAM;

import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int power = Integer.parseInt(scan.nextLine());
        int startingPower = power;
        int distance = Integer.parseInt(scan.nextLine());
        int exhaustion = Integer.parseInt(scan.nextLine());

        int count = 0;

        while(power >= distance){
            power-=distance;
            count++;
            if(power == 0.5 * startingPower){
                if(exhaustion != 0){
                    power/=exhaustion;
                }
            }
        }
        System.out.println(power);
        System.out.println(count);
    }
}
