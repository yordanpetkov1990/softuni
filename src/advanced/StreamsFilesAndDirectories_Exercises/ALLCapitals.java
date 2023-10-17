package advanced.StreamsFilesAndDirectories_Exercises;

import java.io.*;

public class ALLCapitals {
    public static void main(String[] args) throws IOException {
        String path1 = "C:\\Users\\qnida\\IdeaProjects\\softuni\\src\\advanced.StreamsFilesAndDirectories_Exercises\\input.txt";
        String path2 = "C:\\Users\\qnida\\IdeaProjects\\softuni\\src\\advanced.StreamsFilesAndDirectories_Exercises\\output.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path1));
        PrintWriter printWriter = new PrintWriter(new FileWriter(path2));
        String line = bufferedReader.readLine();
        while (line != null){
            String newLine = line.toUpperCase();
            printWriter.println(newLine);

            line = bufferedReader.readLine();
        }
        printWriter.close();
    }
}
