import java.util.Scanner;

public class RadianstoDegrees {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radians = Double.parseDouble(scan.nextLine());
        double degrees = radians * 180 / Math.PI;
        System.out.println(degrees);

    }
}
