package advanced.StreamsFilesAndDirectories_Exercises;

import java.io.File;
import java.nio.file.Paths;

public class GetFolderSize {
    public static void main(String[] args) {
        File file = Paths.get("C:\\Users\\qnida\\IdeaProjects\\softuni\\src\\advanced.StreamsFilesAndDirectories_Exercises\\Exercises Resources").toFile();
        System.out.println("Folder size: " +file.length());

    }
}
