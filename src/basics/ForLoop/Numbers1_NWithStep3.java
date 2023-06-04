package basics.ForLoop;

import java.util.Scanner;

public class Numbers1_NWithStep3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for(int i=1;i<=n;i+=3)
        {
            System.out.printf("%d\n",i);
        }
    }
}
