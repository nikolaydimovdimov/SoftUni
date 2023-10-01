package JADV4_2_Ex_Files_and_Streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P02_SumBytes {
    public static void main(String[] args){
        String path = "C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\Projects\\" +
                "Java_Advanced_09_2023_SolutionOfProblems\\Files-and-Streams-Exercises-Resources\\input.txt";
       try (BufferedReader input=new BufferedReader(new FileReader(path))){
           String currentLine=input.readLine();
            long commonASCiiSum=0;
           while (currentLine!=null){
               for (int i = 0; i < currentLine.length(); i++) {
                    commonASCiiSum+=(int) currentLine.charAt(i);
               }
               currentLine=input.readLine();
           }
           input.close();
           System.out.println(commonASCiiSum);

       }catch (IOException e){
           System.out.println("ERROR - File " + path);
       }
    }
}
