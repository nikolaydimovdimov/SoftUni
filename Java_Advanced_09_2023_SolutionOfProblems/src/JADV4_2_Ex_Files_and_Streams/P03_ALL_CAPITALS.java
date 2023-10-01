package JADV4_2_Ex_Files_and_Streams;

import java.io.*;

public class P03_ALL_CAPITALS {
    public static void main(String[] args){
        String pathInput = "C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\Projects\\" +
                "Java_Advanced_09_2023_SolutionOfProblems\\Files-and-Streams-Exercises-Resources\\input.txt";
        String pathOutput = "C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\Projects\\" +
                "Java_Advanced_09_2023_SolutionOfProblems\\Files-and-Streams-Exercises-Resources\\output1.txt";
        try (BufferedReader input=new BufferedReader(new FileReader(pathInput))){

            PrintWriter output=new PrintWriter(new FileWriter(pathOutput));

            String currentLine=input.readLine();

            while (currentLine!=null){
                output.println(currentLine.toUpperCase());
                currentLine=input.readLine();
            }
            input.close();
            output.close();
        }catch (IOException e){
            System.out.println("ERROR - File " + pathInput);
        }
    }
}
