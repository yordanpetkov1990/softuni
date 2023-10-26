import java.util.Scanner;

public class Saa_ZAD2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int sum = 0;
        while(num > 0){
            int lastDigit = num % 10;
            sum+=lastDigit;
            num/=10;
        }
        System.out.println(sum);



    }
}
