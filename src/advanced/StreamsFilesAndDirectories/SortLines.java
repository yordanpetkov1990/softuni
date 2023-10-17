package advanced.StreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortLines {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\qnida\\IdeaProjects\\softuni\\src\\advanced.StreamsFilesAndDirectories\\input.txt";
        List<String> lines = Files.readAllLines(Paths.get(path));
        Collections.sort(lines);
        Files.write(Paths.get("output5.txt"),lines);

    }
}
