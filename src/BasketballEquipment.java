import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int taksa_per_year =Integer.parseInt(scan.nextLine());
        double kecove = taksa_per_year - (0.4 * taksa_per_year);
        double ekip = kecove - (0.2 * kecove);
        double ball = 0.25 * ekip;
        double akresoari = 0.20 * ball;
        double final_sum = taksa_per_year + kecove + ekip +ball + akresoari;
        System.out.printf("%f",final_sum);
    }
}
