package basics.FirstStepsInProgrammingJava_exam;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percent =Double.parseDouble(scan.nextLine());
        double volume = length*width*height;
        volume/=1000;
        double final_volume = volume -(volume * (percent/100));
        System.out.printf("%f",final_volume);
    }
}
