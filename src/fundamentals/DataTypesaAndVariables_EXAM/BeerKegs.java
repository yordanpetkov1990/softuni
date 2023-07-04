package fundamentals.DataTypesaAndVariables_EXAM;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double max = Double.MIN_VALUE;
        String maxModel = "";
        for(int i = 0;i<n;i++){
            String model = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());
            double volume =  Math.PI * Math.pow(radius,2) * height;
            if(volume>=max){
                max = volume;
                maxModel = model;
            }
        }

        System.out.println(maxModel);
    }
}
