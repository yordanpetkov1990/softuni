package basics.InnerLoops;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int floors = Integer.parseInt(scan.nextLine());
        int count_rooms_per_floor = Integer.parseInt(scan.nextLine());

        for(int i = floors;i >=1;i--){
            for(int y = 0;y<count_rooms_per_floor;y++){
                if(i == floors){
                    System.out.printf("L%d%d ",i,y);
                }
                else if(i % 2 != 0) {
                    System.out.printf("A%d%d ",i,y);
                }
                else{
                    System.out.printf("O%d%d ",i,y);
                }
            }
            System.out.printf("\n");
        }
    }
}
