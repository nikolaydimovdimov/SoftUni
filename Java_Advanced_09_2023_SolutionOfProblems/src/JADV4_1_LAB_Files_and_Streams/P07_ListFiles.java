package JADV4_1_LAB_Files_and_Streams;

import java.io.File;

public class P07_ListFiles {
    public static void main(String[] args){
        String pathToDir="C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\Projects\\" +
                "Java_Advanced_09_2023_SolutionOfProblems\\Files-and-Streams-Lab-Resources\\Files-and-Streams";

        File file= new File(pathToDir);

        File[] files=file.listFiles();

        for (File fileName : files) {
            if(fileName.isFile()){
                System.out.println(fileName.getName() +": ["+fileName.length()+"]");
            }
        }
    }
}
