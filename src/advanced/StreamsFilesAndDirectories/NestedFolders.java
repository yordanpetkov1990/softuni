package advanced.StreamsFilesAndDirectories;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class NestedFolders {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\qnida\\IdeaProjects\\softuni\\src\\advanced.StreamsFilesAndDirectories\\Files-and-Streams");
        Deque<File> stack = new ArrayDeque<>();
        int count = 1;
        if(file.isDirectory()){
            stack.push(file);
        }

        while (!stack.isEmpty()){
            File directory = stack.pop();
            File[] files = directory.listFiles();
            for (File file1 : files) {
                if(file1.isDirectory()){
                    stack.push(file1);
                    System.out.println(file1.getName());
                    count++;
                }

            }

        }
        System.out.println(count + " folders");
    }
}
