package JADV4_1_LAB_Files_and_Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class P04_ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        String pathInput = "C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\" +
                "Projects\\Java_Advanced_09_2023_SolutionOfProblems\\Files-and-Streams-Lab-Resources\\input.txt";
        String pathOutput = "C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\" +
                "Projects\\Java_Advanced_09_2023_SolutionOfProblems\\Files-and-Streams-Lab-Resources\\output2.txt";

        Scanner scanner=new Scanner(new FileInputStream(pathInput));
        PrintWriter output=new PrintWriter(new FileOutputStream(pathOutput));

        while (scanner.hasNext()){
            if(scanner.hasNextInt()){
                output.println(scanner.next());
            }
                scanner.next();
        }
        scanner.close();
        output.close();

    }
}
