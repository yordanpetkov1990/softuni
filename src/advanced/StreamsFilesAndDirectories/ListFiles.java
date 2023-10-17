package advanced.StreamsFilesAndDirectories;

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\qnida\\IdeaProjects\\softuni\\src\\advanced.StreamsFilesAndDirectories\\Files-and-Streams");
        File[] files = file.listFiles();
        assert files != null;
        for (File file1 : files) {
            if(!file1.isDirectory()){
                System.out.println(file1.getName() +": [" +file1.length()+"]");;
            }

        }
    }
}
