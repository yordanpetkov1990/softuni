package fundamentals.BasicSyntaxConditionalStatementsandLoops_exam;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scan.nextLine());
        int countOfStudent = Integer.parseInt(scan.nextLine());
        double priceForLightSabers = Double.parseDouble(scan.nextLine());
        double priceForRobes = Double.parseDouble(scan.nextLine());
        double priceOfBelts = Double.parseDouble(scan.nextLine());
        int freeBelts = countOfStudent / 6;
        int studentsSabers = (int) (countOfStudent + Math.ceil(0.1 * countOfStudent));
        int studentsBelts = countOfStudent - freeBelts;

        double Totalprice = (studentsSabers * priceForLightSabers) + (priceForRobes * countOfStudent) + (studentsBelts*priceOfBelts);
        if(Totalprice > amountOfMoney){
            System.out.printf("George Lucas will need %.2flv more.",Totalprice-amountOfMoney);
        }
        else{
            System.out.printf("The money is enough - it would cost %.2flv.",Totalprice);
        }
    }

}
