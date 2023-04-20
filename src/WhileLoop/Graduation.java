package WhileLoop;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int numbers = 1;
        int bomba = 0;
        double sum = 0;
        while(12 >= numbers)
        {
            double ocenka = Double.parseDouble(scan.nextLine());
            if(ocenka < 4.00){
                bomba+=1;
            }
            if(bomba > 1)
            {
                System.out.printf("%s has been excluded at %d grade",name,numbers-1);
                return;
            }
            sum+=ocenka;

            numbers++;
        }
        double average = sum/(numbers-1);
        System.out.printf("%s graduated. Average grade: %.2f",name,average);

    }
}
