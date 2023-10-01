package JADV4_1_LAB_Files_and_Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P02_WriteToFile {
    public static void main(String[] args) {
        Set<Character> symbolsSet = new HashSet<>(Arrays.asList(',', '.', '!', '?'));
        String pathInput = "C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\" +
                "Projects\\Java_Advanced_09_2023_SolutionOfProblems\\Files-and-Streams-Lab-Resources\\input.txt";
        String pathOutput = "C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\" +
                "Projects\\Java_Advanced_09_2023_SolutionOfProblems\\Files-and-Streams-Lab-Resources\\output.txt";
        try (FileInputStream inputStream = new FileInputStream(pathInput)) {
            FileOutputStream outputStream = new FileOutputStream(pathOutput);
            int inputByte = inputStream.read();
            while (inputByte != -1) {
                if (!symbolsSet.contains((char) inputByte)) {
                    outputStream.write(inputByte);
                }
                inputByte = inputStream.read();
            }
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            System.out.println("File " + pathInput + "was not found!");
        }
    }
}
