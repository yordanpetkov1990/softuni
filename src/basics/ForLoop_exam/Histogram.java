package basics.ForLoop_exam;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {


        int p1_counter=0;
        int p2_counter=0;
        int p3_counter=0;
        int p4_counter=0;
        int p5_counter=0;
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(scan.nextLine());
            if(x<200)
            {
                p1_counter++;
            }
            else if(x>=200 && x <400)
            {
                p2_counter++;
            }
            else if(x>=400 && x <600)
            {
                p3_counter++;
            }
            else if(x>=600 && x<800)
            {
                p4_counter++;
            }
            else{
                p5_counter++;
            }
        }
        double p1 =  (double)p1_counter / N * 100;
        double p2 = (double)p2_counter / N * 100;
        double p3 = (double)p3_counter / N * 100;
        double p4 = (double)p4_counter / N * 100;
        double p5 = (double)p5_counter / N * 100;
        System.out.printf("%.2f%%%n",p1);
        System.out.printf("%.2f%%%n",p2);
        System.out.printf("%.2f%%%n",p3);
        System.out.printf("%.2f%%%n",p4);
        System.out.printf("%.2f%%%n",p5);
    }
}
