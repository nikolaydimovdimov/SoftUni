package JADV4_2_Ex_Files_and_Streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P01_SumLines {
    public static void main(String[] args) {
        String path = "C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\Projects\\" +
                "Java_Advanced_09_2023_SolutionOfProblems\\Files-and-Streams-Exercises-Resources\\input.txt";

        try (BufferedReader inputLines = new BufferedReader(new FileReader(path))) {
            String currentLine = inputLines.readLine();

            while (currentLine != null) {

                int sumASCII = 0;
                for (int i = 0; i < currentLine.length(); i++) {
                    sumASCII += (int) currentLine.charAt(i);
                }
                System.out.println(sumASCII);
                currentLine = inputLines.readLine();
            }
            inputLines.close();
        } catch (IOException e) {
            System.out.println("Error - file " + path);
        }

    }
}
