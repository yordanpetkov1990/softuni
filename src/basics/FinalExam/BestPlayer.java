package basics.FinalExam;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int max = Integer.MIN_VALUE;
        String final_name = "";

        while(!input.equals("END")){
            String name = input;
            int goals = Integer.parseInt(scan.nextLine());
            if(goals>max){
                final_name = name;
                max = goals;
            }
            if (goals >= 10) {
                break;
            }
            input = scan.nextLine();
        }
        if(max >=3){
            System.out.printf("%s is the best player!\n",final_name);
            System.out.printf("He has scored %d goals and made a hat-trick !!!",max);
        }
        else{
            System.out.printf("%s is the best player!\n",final_name);
            System.out.printf("He has scored %d goals.",max);
        }
    }
}
