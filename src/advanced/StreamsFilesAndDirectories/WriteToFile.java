package advanced.StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class WriteToFile {
    public static void main(String[] args) {
        List<String> punctuaction = List.of(",", ".", "!", "?");
        String inputPath = "C:\\Users\\qnida\\IdeaProjects\\softuni\\src\\advanced.StreamsFilesAndDirectories\\input.txt";
        String outputPath = "C:\\Users\\qnida\\IdeaProjects\\softuni\\src\\advanced.StreamsFilesAndDirectories\\output.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(inputPath);
            FileOutputStream fileOutputStream = new FileOutputStream(outputPath);
            int oneByte = fileInputStream.read();
            while(oneByte >= 0){
                if(!punctuaction.contains("" +(char) oneByte)){
                    fileOutputStream.write(oneByte);
                }

                oneByte = fileInputStream.read();
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
