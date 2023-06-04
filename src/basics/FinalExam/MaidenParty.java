package basics.FinalExam;

import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double party_price = Double.parseDouble(scan.nextLine());
        int poslaniq_count = Integer.parseInt(scan.nextLine());
        int rozi_count = Integer.parseInt(scan.nextLine());
        int kluchodurjateli_count = Integer.parseInt(scan.nextLine());
        int karikaturi_count = Integer.parseInt(scan.nextLine());
        int kusmeti_count = Integer.parseInt(scan.nextLine());

        double winnings = poslaniq_count * 0.60 + rozi_count * 7.20 + kluchodurjateli_count * 3.60 + karikaturi_count * 18.20 + kusmeti_count * 22;
        int count = poslaniq_count + rozi_count + kluchodurjateli_count + karikaturi_count + kusmeti_count;

        if(count >= 25){
            winnings = winnings - (0.35 * winnings);
        }
        winnings = winnings - (0.10 * winnings);
        if(winnings>=party_price){
            System.out.printf("Yes! %.2f lv left.",winnings-party_price);
        }
        else{
            System.out.printf("Not enough money! %.2f lv needed.",party_price-winnings);
        }
    }
}
