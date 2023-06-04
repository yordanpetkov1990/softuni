package basics.FinalExam;

import java.util.Scanner;

public class SantasHoliday {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count_prestoi = Integer.parseInt(scan.nextLine());
        String type_room = scan.nextLine();
        String grade = scan.nextLine();
        double sum = 1;
        count_prestoi = count_prestoi - 1;

        switch (type_room){
            case "room for one person":
                sum = count_prestoi * 18.00;
                break;
            case "apartment":
                sum = count_prestoi * 25.00;
                if(count_prestoi < 10){
                    sum = sum - (0.30 * sum);
                }
                else if(count_prestoi >= 10 && count_prestoi <= 15){
                    sum = sum - (0.35 * sum);
                }
                else {
                    sum = sum - (0.50 * sum);
                }
                break;
            case "president apartment":
                sum = count_prestoi * 35.00;
                if(count_prestoi < 10){
                    sum = sum - (0.10 * sum);
                }
                else if(count_prestoi >= 10 && count_prestoi <= 15){
                    sum = sum - (0.15 * sum);
                }
                else {
                    sum = sum - (0.20 * sum);
                }
                break;

        }
        if(grade.equals("positive")){
            sum = sum + (0.25 * sum);
        }
        else if(grade.equals("negative")){
            sum = sum - (0.10 * sum);
        }
        System.out.printf("%.2f",sum);
    }
}
