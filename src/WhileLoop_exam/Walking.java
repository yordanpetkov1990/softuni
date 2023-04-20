package WhileLoop_exam;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int f_walks = 0;
        boolean isValid = true;
        while (isValid){
            String walks = scan.nextLine();
            if(walks.equals("Going home")){
                int walks1 = Integer.parseInt(scan.nextLine());
                f_walks+=walks1;
                isValid=false;
            }
            else{
                int walks2 = Integer.parseInt(walks);
                f_walks+=walks2;
            }
            if(f_walks>=10000){
                System.out.printf("Goal reached! Good job!\n" +
                        "%d steps over the goal!\n",f_walks-10000);
                return;
            }

        }

        if(f_walks<10000){
            System.out.printf("%d more steps to reach goal.",10000-f_walks);
        }
        else{
            System.out.printf("Goal reached! Good job!\n" +
                    "%d steps over the goal!\n",f_walks-10000);
        }
    }
}
