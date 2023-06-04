package basics.FinalExam;

import java.util.Scanner;

public class Substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = Integer.parseInt(scanner.nextLine());
        int L = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());


        int count = 0;
        for (int i = K; i <= 8; i++) {
            for (int j = 9; j >= L; j--) {
                for (int p = M; p <= 8; p++) {
                    for (int q = 9; q >= N; q--) {
                        boolean flag = i != p;
                        boolean flag1 = j != q;
                        if ((i % 2 == 0 && j % 2 != 0) && (p % 2 == 0 && q % 2 != 0)) {
                            if (flag || flag1) {
                                System.out.printf("%d%d - %d%d\n", i, j, p, q);
                                count++;
                            }
                            else{
                                System.out.printf("Cannot change the same player.\n");
                            }
                        }
                        if (count == 6) {
                            return;
                        }
                    }
                }
            }
        }
    }
}
