package fundamentals.BasicSyntaxConditionalStatementsandLoops_exam;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for(int i = 1;i<=n;i++){
            for(int y = n-i;y<n;y++){
                System.out.printf("%d ",i);
            }
            System.out.println("");
        }
    }
}
