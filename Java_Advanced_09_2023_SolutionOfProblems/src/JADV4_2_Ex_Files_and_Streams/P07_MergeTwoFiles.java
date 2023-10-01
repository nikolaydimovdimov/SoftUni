package JADV4_2_Ex_Files_and_Streams;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class P07_MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        String pathOne="C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\Projects\\" +
            "Java_Advanced_09_2023_SolutionOfProblems\\Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String pathTwo="C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\Projects\\" +
            "Java_Advanced_09_2023_SolutionOfProblems\\Files-and-Streams-Exercises-Resources\\inputTwo.txt";
        String pathOutput = "C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\Projects\\" +
                "Java_Advanced_09_2023_SolutionOfProblems\\Files-and-Streams-Exercises-Resources\\merges.txt";
        String input= Files.readString(Path.of(pathOne))+"\n";
        input+=Files.readString(Path.of(pathTwo));
        PrintWriter output=new PrintWriter(pathOutput);
        output.print(input);
        output.close();
    }
}
