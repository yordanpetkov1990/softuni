package fundamentals.TextProccessing;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] commandParts = scan.nextLine().split("\\\\");
        String[] fileNameExtension = commandParts[commandParts.length-1].split("\\.");
        System.out.println("File name: " + fileNameExtension[0]);
        System.out.println("File extension: " + fileNameExtension[1]);
    }
}
