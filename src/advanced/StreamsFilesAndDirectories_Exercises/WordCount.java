package advanced.StreamsFilesAndDirectories_Exercises;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) throws IOException {
        List<String> strings = Files.readAllLines(Paths.get("C:\\Users\\qnida\\IdeaProjects\\softuni\\src\\advanced.StreamsFilesAndDirectories_Exercises\\words.txt"));
        String string = strings.toString().replace("[","").replace("]","");
        String path = "C:\\Users\\qnida\\IdeaProjects\\softuni\\src\\advanced.StreamsFilesAndDirectories_Exercises\\output3.txt";
        List<String> tokens = Arrays.stream(string.split(" ")).collect(Collectors.toList());

        Map<String,Integer> countOfWords = new LinkedHashMap<>();
        PrintWriter printWriter = new PrintWriter(new FileWriter(path));

        List<String> check = Files.readAllLines(Paths.get("C:\\Users\\qnida\\IdeaProjects\\softuni\\src\\advanced.StreamsFilesAndDirectories_Exercises\\text.txt"));


        for (String line : check) {
            String[] s = line.split(" ");
            for (String s1 : s) {
                if(tokens.contains(s1)){
                    if(!countOfWords.containsKey(s1)){
                        countOfWords.put(s1,1);
                    }else{
                        countOfWords.put(s1,countOfWords.get(s1) + 1);
                    }
                }
            }
        }
        for (Map.Entry<String, Integer> entry : countOfWords.entrySet()) {
                printWriter.println(String.format("%s - %d",entry.getKey(),entry.getValue()));
        }
        printWriter.close();
    }

}
