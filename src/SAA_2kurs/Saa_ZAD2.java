package SAA_2kurs;

import java.util.Scanner;

public class Saa_ZAD2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Четене на броя на елементите в масива
            System.out.print("Въведете броя на елементите в масива: ");
            int n = scanner.nextInt();

            // Четене на елементите на масива
            int[] array = new int[n];
            System.out.println("Въведете елементите на масива:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            // Намиране на броя на намаляващите редици, техните дължини и най-дългата от тях
            int decreasingSequencesCount = 0;
            int currentSequenceLength = 1;
            int longestSequenceLength = 1;

            for (int i = 1; i < n; i++) {
                if (array[i] < array[i - 1]) {
                    currentSequenceLength++;
                } else {
                    if (currentSequenceLength > 1) {
                        decreasingSequencesCount++;
                        if (currentSequenceLength > longestSequenceLength) {
                            longestSequenceLength = currentSequenceLength;
                        }
                    }
                    currentSequenceLength = 1;
                }
            }

            // Проверка за последната намаляваща редица
            if (currentSequenceLength > 1) {
                decreasingSequencesCount++;
                if (currentSequenceLength > longestSequenceLength) {
                    longestSequenceLength = currentSequenceLength;
                }
            }

            // Извеждане на резултата
            System.out.println("Брой на намаляващите редици: " + decreasingSequencesCount);
            System.out.println("Най-дълга намаляваща редица: " + longestSequenceLength);
        }
    }


