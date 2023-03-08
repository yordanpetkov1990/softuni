import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nailon = Integer.parseInt(scan.nextLine());
        int boq = Integer.parseInt(scan.nextLine());
        int razreditel = Integer.parseInt(scan.nextLine());
        double bonus_boq = boq +(0.1 * boq);
        double bonus_nailon = nailon + 2;
        int hours = Integer.parseInt(scan.nextLine());
        double final_sum = bonus_nailon * 1.5 + bonus_boq * 14.5 + razreditel * 5 + 0.4;
        double suma_za_maistori = 0.3 * final_sum * hours;
        final_sum+=suma_za_maistori;
        System.out.printf("%f",final_sum);

    }
}
