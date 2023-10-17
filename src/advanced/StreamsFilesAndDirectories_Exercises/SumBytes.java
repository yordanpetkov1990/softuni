package advanced.StreamsFilesAndDirectories_Exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args) throws IOException {


        String path = "C:\\Users\\qnida\\IdeaProjects\\softuni\\src\\advanced.StreamsFilesAndDirectories_Exercises\\input.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String line = bufferedReader.readLine();
        int sum = 0;
        while (line != null) {

            for (int i = 0; i < line.length(); i++) {
                char currentChar = line.charAt(i);
                sum += currentChar;
            }
            line = bufferedReader.readLine();
        }
        System.out.println(sum);
    }
}

