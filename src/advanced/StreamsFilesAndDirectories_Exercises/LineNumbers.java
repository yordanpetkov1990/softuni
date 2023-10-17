package advanced.StreamsFilesAndDirectories_Exercises;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LineNumbers {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\qnida\\IdeaProjects\\softuni\\src\\advanced.StreamsFilesAndDirectories_Exercises\\inputLineNumbers.txt";
        String path1 = "C:\\Users\\qnida\\IdeaProjects\\softuni\\src\\advanced.StreamsFilesAndDirectories_Exercises\\output2.txt";
        PrintWriter printWriter = new PrintWriter(new FileWriter(path1));
        List<String> lines = Files.readAllLines(Paths.get(path));
        int number = 1;
        for (String line : lines) {
            printWriter.println(number + ". " + line);

            number++;
        }
        printWriter.close();
    }
}
