package basics.WhileLoop_exam;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        int sum_dqlove = 0;

        int f_pieces = width * height;
        int pieces = f_pieces;
        while (pieces >= 0){
            String command = scan.nextLine();
            if(command.equals("STOP")){
                break;
            }
            else{
                int dql = Integer.parseInt(command);
                pieces-=dql;
                sum_dqlove+=dql;
            }


        }
        if(sum_dqlove > f_pieces){
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(sum_dqlove-f_pieces));
        }
        else{
            System.out.printf("%d pieces are left.",f_pieces-sum_dqlove);
        }

    }
}
