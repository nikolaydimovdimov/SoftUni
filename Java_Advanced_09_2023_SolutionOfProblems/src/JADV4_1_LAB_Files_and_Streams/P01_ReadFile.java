package JADV4_1_LAB_Files_and_Streams;

import java.io.FileInputStream;
import java.io.IOException;

public class P01_ReadFile {
    public static void main(String[] args) {
        String path="C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\" +
                "Projects\\Java_Advanced_09_2023_SolutionOfProblems\\Files-and-Streams-Lab-Resources\\input.txt";
        try (FileInputStream inputStream=new FileInputStream(path)){
            int oneByte=inputStream.read();
            while (oneByte!=-1){
                System.out.printf("%s ",Integer.toBinaryString(oneByte));
                oneByte=inputStream.read();
            }
        } catch (IOException e){
            System.out.println("File "+ path +"was not found!");
        }



    }
}
