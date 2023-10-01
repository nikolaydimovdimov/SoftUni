package JADV4_1_LAB_Files_and_Streams;

import java.io.File;

public class P08_NestedFolders {
    private static int counterDir=0;
    public static void main(String[] args) {
        String path = "C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\Projects\\Java_Advanced_09_2023_SolutionOfProblems\\Files-and-Streams-Lab-Resources";

        printFileList(path);
        System.out.println(counterDir+" folders");


    }


    private static void printFileList(String path) {


        File file = new File(path);
        File[] filesInDir = file.listFiles();


        if (filesInDir.length == 0) return;
        for (File files : filesInDir) {
            if (files.isDirectory()) {
                System.out.println(files.getName());
                counterDir++;
            }
        }
        for (File files : filesInDir) {
            if (files.isDirectory()) {
                String newPath = files.getPath();
                printFileList(newPath);
            }
        }
        return;
    }


}
