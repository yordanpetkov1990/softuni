import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fname = scan.nextLine();
        String lname = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String town = scan.nextLine();
        System.out.println("You are " + fname + " " + lname+ ", a " + age + "-years old person from " + town +".");
    }
}
