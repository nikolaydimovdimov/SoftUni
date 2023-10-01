package JADV4_1_LAB_Files_and_Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P03_CopyBytes {
    public static void main(String[] args) {
        String pathInput = "C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\" +
                "Projects\\Java_Advanced_09_2023_SolutionOfProblems\\Files-and-Streams-Lab-Resources\\input.txt";
        String pathOutput = "C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\" +
                "Projects\\Java_Advanced_09_2023_SolutionOfProblems\\Files-and-Streams-Lab-Resources\\output1.txt";
        try(FileInputStream inputStream=new FileInputStream(pathInput)){
            FileOutputStream outputStream=new FileOutputStream(pathOutput);
            int inputByte=inputStream.read();
            while (inputByte!=-1){
                if(inputByte==32 || inputByte==10) {
                    outputStream.write(inputByte);
                }else{
                    String output=String.valueOf(inputByte);
                    for (int i = 0; i < output.length(); i++) {
                        outputStream.write(output.charAt(i));
                    }
                }
                inputByte=inputStream.read();
            }
            inputStream.close();
            outputStream.close();
        }catch (IOException e){
            System.out.printf("READ ERROR! File: %s%n",pathInput);
        }
    }
}
