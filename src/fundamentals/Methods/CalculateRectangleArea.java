package fundamentals.Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double width = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(Area(width,height)));



    }
    public static double Area(double width,double height){
        double area = width * height;
        return area;
    }
}
