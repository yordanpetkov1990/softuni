import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());

        String text1 = String.valueOf(a);
        String text2 = "";
        for(int i = text1.length()-1;i>=0;i--){
            text2+=text1.charAt(i);
        }
        System.out.println();

    }
}