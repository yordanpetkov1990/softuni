package advanced.StreamsFilesAndDirectories_Exercises;

import java.io.*;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        String path1 = "C:\\Users\\qnida\\IdeaProjects\\softuni\\src\\advanced.StreamsFilesAndDirectories_Exercises\\inputOne.txt";
        String path2 = "C:\\Users\\qnida\\IdeaProjects\\softuni\\src\\advanced.StreamsFilesAndDirectories_Exercises\\inputTwo.txt";
        String path3 = "C:\\Users\\qnida\\IdeaProjects\\softuni\\src\\advanced.StreamsFilesAndDirectories_Exercises\\output4.txt";

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(path1));
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(path2));
        PrintWriter printWriter = new PrintWriter(new FileWriter(path3));
        String line1 = bufferedReader1.readLine();
        while (line1 != null){
            printWriter.println(line1);
            line1 =bufferedReader1.readLine();
        }
        String line2 = bufferedReader2.readLine();
        while (line2 != null){
            printWriter.println(line2);
            line2 =bufferedReader2.readLine();
        }
        printWriter.close();
    }
}
