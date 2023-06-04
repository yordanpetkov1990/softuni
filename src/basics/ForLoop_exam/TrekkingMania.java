package basics.ForLoop_exam;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int group_counts = Integer.parseInt(scan.nextLine());
        int musala_count = 0;
        int monblan_count = 0;
        int kilimandjaro_count = 0;
        int k2_count = 0;
        int everest_count = 0;
        for(int i=0;i<group_counts;i++) {
            int x = Integer.parseInt(scan.nextLine());
            if (x <=5) {
                musala_count+=x;
            } else if (x >= 6 && x <= 12) {
                monblan_count+=x;
            } else if (x > 12 && x <= 25) {
                kilimandjaro_count+=x;
            } else if (x > 25 && x <= 40) {
                k2_count+=x;
            } else{
                everest_count+=x;
            }
        }
        int all = musala_count+monblan_count+kilimandjaro_count+k2_count+everest_count;
        System.out.printf("%.2f%%%n", (double)musala_count / all  * 100);
        System.out.printf("%.2f%%%n", (double)monblan_count / all  * 100);
        System.out.printf("%.2f%%%n", (double)kilimandjaro_count / all  * 100);
        System.out.printf("%.2f%%%n", (double)k2_count / all  * 100);
        System.out.printf("%.2f%%%n", (double)everest_count / all  * 100);
    }
}
