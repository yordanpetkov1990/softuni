package advanced.StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) {
        String inputPath = "C:\\Users\\qnida\\IdeaProjects\\softuni\\src\\advanced.StreamsFilesAndDirectories\\input.txt";
        String outputPath = "C:\\Users\\qnida\\IdeaProjects\\softuni\\src\\advanced.StreamsFilesAndDirectories\\output2.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(inputPath);
            FileOutputStream fileOutputStream = new FileOutputStream(outputPath);
            int oneByte = fileInputStream.read();

            while(oneByte >= 0){
                String oneByte1 = String.valueOf(oneByte);
                if(oneByte1.equals("32") || oneByte1.equals("10") || oneByte1.equals("12")){
                    fileOutputStream.write(oneByte);
                }
                else{
                    for (int i = 0; i < oneByte1.length(); i++) {
                        fileOutputStream.write(oneByte1.charAt(i));
                    }
                }


                oneByte = fileInputStream.read();
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
