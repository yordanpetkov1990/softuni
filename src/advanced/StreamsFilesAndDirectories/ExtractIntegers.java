package advanced.StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\qnida\\IdeaProjects\\softuni\\src\\advanced.StreamsFilesAndDirectories\\input.txt";
        Scanner scan = new Scanner(new FileInputStream(path));
        PrintWriter printWriter = new PrintWriter(new FileOutputStream("C:\\Users\\qnida\\IdeaProjects\\softuni\\src\\advanced.StreamsFilesAndDirectories\\output3.txt"));


        while (scan.hasNext()){
            if(scan.hasNextInt()){
                printWriter.println(scan.next());
            }
            scan.next();
        }
        printWriter.close();
    }
}
