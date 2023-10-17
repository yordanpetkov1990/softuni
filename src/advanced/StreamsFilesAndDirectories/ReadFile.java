package advanced.StreamsFilesAndDirectories;



import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\qnida\\IdeaProjects\\softuni\\src\\advanced.StreamsFilesAndDirectories\\input.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            int oneByte = fileInputStream.read();
            while (oneByte >= 0) {
                System.out.printf("%s ", Integer.toBinaryString(oneByte));
                oneByte = fileInputStream.read();
            }
            System.out.println();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
