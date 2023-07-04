package fundamentals.ExamPrepartion_exam;

import java.util.Scanner;

public class SoftuniReception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int effiency1 = Integer.parseInt(scan.nextLine());
        int effiency2 = Integer.parseInt(scan.nextLine());
        int effiency3 = Integer.parseInt(scan.nextLine());
        int countStudent = Integer.parseInt(scan.nextLine());
        int sumEffiency = effiency1+effiency2+effiency3;
        int hour= 1;
        while(countStudent> 0){
            if(hour % 4 != 0){
                countStudent-=sumEffiency;
                hour++;
            }
            else{
                hour++;
            }
        }
        System.out.printf("Time needed: %dh.",hour-1);

    }
}
