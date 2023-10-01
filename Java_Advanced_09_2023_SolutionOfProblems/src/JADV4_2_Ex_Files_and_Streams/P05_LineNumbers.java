package JADV4_2_Ex_Files_and_Streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class P05_LineNumbers {
    public static void main(String[] args) {
        String pathInput = "C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\Projects\\" +
                "Java_Advanced_09_2023_SolutionOfProblems\\Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        String pathOutput = "C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\Projects\\" +
                "Java_Advanced_09_2023_SolutionOfProblems\\Files-and-Streams-Exercises-Resources\\output3.txt";

        try (BufferedReader input = new BufferedReader(new FileReader(pathInput))) {
            PrintWriter output = new PrintWriter(pathOutput);

            String line = input.readLine();
            int counter = 0;

            while (line != null) {
                counter++;
                output.println(counter + ". " + line);
                line = input.readLine();
            }

            input.close();
            output.close();

        } catch (IOException e) {
            System.out.println("Error - File: " + pathInput);
        }
    }
}
