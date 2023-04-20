package WhileLoop_exam;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());
        int problems_count = 0;
        int sum = 0;
        int bomba = 0;

        String input = "";
        String name = "";


        while(!input.equals("Enough")){
            name = scan.nextLine();
            if(name.equals("Enough")){
                break;
            }
            int ocenka = Integer.parseInt(scan.nextLine());
            if(ocenka <= 4){
                bomba++;
            }
            if(bomba==count)
            {
                System.out.printf("You need a break, %d poor grades.",bomba);
                return;
            }
            sum+=ocenka;
            problems_count++;
            input = name;
        }
        double average = sum * 1.0 / problems_count * 1.0;
        System.out.printf("Average score: %.2f\n",average);
        System.out.printf("Number of problems: %d\n",problems_count);
        System.out.printf("Last problem: %s\n",input);
    }
}
