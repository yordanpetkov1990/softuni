package basics.WhileLoop_exam;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        int final_cubic_meters = width * height * length;
        int sum_cubic_meters = 0;
        boolean isValid = true;

        while(isValid){
            String command = scan.nextLine();
            if(command.equals("Done")){
                isValid=false;
            }
            else{
                int cubic_meters = Integer.parseInt(command);
                sum_cubic_meters+=cubic_meters;
            }
            if(sum_cubic_meters>=final_cubic_meters){
                System.out.printf("No more free space! You need %d Cubic meters more.",sum_cubic_meters-final_cubic_meters);
                return;
            }
        }
        System.out.printf("%d Cubic meters left.",final_cubic_meters-sum_cubic_meters);
    }
}
