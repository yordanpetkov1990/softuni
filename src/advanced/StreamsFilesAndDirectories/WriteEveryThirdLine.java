package advanced.StreamsFilesAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\qnida\\IdeaProjects\\softuni\\src\\advanced.StreamsFilesAndDirectories\\input.txt";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));

        String line = bufferedReader.readLine();
        int counter = 1;
        List<String> lines = new ArrayList<>();
        while (line != null){

            if(counter % 3 == 0){
                lines.add(line);
            }
            counter++;
            line = bufferedReader.readLine();
        }
        Path objectPath = Paths.get("output4.txt");
        Files.write(objectPath,lines);


    }
}
