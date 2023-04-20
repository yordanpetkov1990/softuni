import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = Integer.parseInt(scan.nextLine());
        for(int i=1;i<=height;i++)
        {
            for(int y = 1;y<=i;y++)
            {
                System.out.printf("%d",y);
            }
            System.out.println("");

        }
    }
}
