import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = Integer.parseInt(scan.nextLine());
        for(int i =0;i <height;i++){
            for(int spaces=height-1;spaces >= i;spaces--){
                System.out.printf(" ");
            }
            for(int y = 0;y <=i;y++){
                    System.out.printf("#");
            }
            System.out.printf("\n");


        }
    }
}
