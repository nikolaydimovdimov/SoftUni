package JADV4_1_LAB_Files_and_Streams;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class P06_SortLines {
    public  static void main(String[] args) throws IOException {

        String pathInput = "C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\" +
                "Projects\\Java_Advanced_09_2023_SolutionOfProblems\\Files-and-Streams-Lab-Resources\\input.txt";
        String pathOutput = "C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\" +
                "Projects\\Java_Advanced_09_2023_SolutionOfProblems\\Files-and-Streams-Lab-Resources\\output4.txt";

//        BufferedReader inputBuffer=new BufferedReader(new FileReader(pathInput));
        PrintWriter printBuffer= new PrintWriter(new FileWriter(pathOutput));

        List<String> linesList= Files.readAllLines(Path.of(pathInput));

        Collections.sort(linesList);

       linesList.forEach(e -> printBuffer.println(e));
        printBuffer.close();
    }
}
