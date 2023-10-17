package advanced.StreamsFilesAndDirectories_Exercises;

import java.io.*;
import java.util.List;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        String path1 = "C:\\Users\\qnida\\IdeaProjects\\softuni\\src\\advanced.StreamsFilesAndDirectories_Exercises\\input.txt";
        String path2 = "C:\\Users\\qnida\\IdeaProjects\\softuni\\src\\advanced.StreamsFilesAndDirectories_Exercises\\output1.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path1));
        List<Character> vowels = List.of('a','e','i','o','u');
        int countVowels = 0;
        List<Character> punctiation = List.of('!',',','?','.');
        int countPunctuation = 0;
        int others = 0;
        PrintWriter printWriter = new PrintWriter(new FileWriter(path2));

        String line = bufferedReader.readLine();

        while (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    char currentChar =line.charAt(i);
                    if (vowels.contains(currentChar)) {
                        countVowels++;
                    } else if (punctiation.contains(currentChar)) {
                        countPunctuation++;
                    } else if(currentChar != ' ') {
                        others++;
                    }
                }

            line = bufferedReader.readLine();
        }
        printWriter.printf("Vowels: %d\n",countVowels);
        printWriter.printf("Other symbols: %d\n",others);
        printWriter.printf("Punctuation: %d\n",countPunctuation);
        printWriter.flush();

    }
}
