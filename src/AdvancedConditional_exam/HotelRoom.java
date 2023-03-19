package AdvancedConditional_exam;

import java.util.Scanner;

public class HotelRoom{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();
        int nightsCnt = Integer.parseInt(sc.nextLine());
        double studioPrice = 0;
        double apartmentPrice = 0;

        switch (month) {
            case "May":
            case "October":
                studioPrice = 50;
                apartmentPrice = 65;
                if (nightsCnt > 7 && nightsCnt <= 14) {
                    studioPrice = studioPrice * 0.95;
                } else if (nightsCnt > 14) {
                    studioPrice = studioPrice * 0.7;
                }
                if (nightsCnt > 14) {
                    apartmentPrice = apartmentPrice * 0.9;
                }
                break;
            case "June":
            case "September":
                studioPrice = 75.20;
                apartmentPrice = 68.70;
                if (nightsCnt > 14) {
                    studioPrice = studioPrice * 0.8;
                    apartmentPrice = apartmentPrice * 0.9;
                }
                break;
            case "July":
            case "August":
                apartmentPrice = 77;
                studioPrice = 76;
                if (nightsCnt>14) {
                    apartmentPrice = apartmentPrice * 0.9;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice * nightsCnt);
        System.out.printf("Studio: %.2f lv.", studioPrice * nightsCnt);

    }
}