package JADV4_1_LAB_Files_and_Streams;

import java.io.*;

public class P05_WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        String pathInput = "C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\" +
                "Projects\\Java_Advanced_09_2023_SolutionOfProblems\\Files-and-Streams-Lab-Resources\\input.txt";
        String pathOutput = "C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\" +
                "Projects\\Java_Advanced_09_2023_SolutionOfProblems\\Files-and-Streams-Lab-Resources\\output3.txt";

        BufferedReader inputBuffer=new BufferedReader(new FileReader(pathInput));
        PrintWriter printBuffer= new PrintWriter(new FileWriter(pathOutput));

        String line=inputBuffer.readLine();
        int counter=1;
        while (line!=null){
            if(counter==3){
                counter=0;
                printBuffer.println(line);
            }
            line=inputBuffer.readLine();
            counter++;
        }
        inputBuffer.close();
        printBuffer.close();


    }
}
