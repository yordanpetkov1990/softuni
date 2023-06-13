package DataTypesAndVariables;

import java.util.Scanner;

public class RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length;
        System.out.print("Length: ");
        length = Double.parseDouble(scanner.nextLine());
        double width;
        System.out.print("Width: ");
        width = Double.parseDouble(scanner.nextLine());
        double height;
        System.out.print("Height: ");
        height = Double.parseDouble(scanner.nextLine());
        double volume;
        volume = (length * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", volume);

    }
}
