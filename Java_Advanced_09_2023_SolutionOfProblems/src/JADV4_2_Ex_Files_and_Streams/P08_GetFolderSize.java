package JADV4_2_Ex_Files_and_Streams;

import java.io.File;

public class P08_GetFolderSize {
    public static void main(String[] args) {
        String path = "C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\Projects\\Java_Advanced_09_2023_SolutionOfProblems" +
                "\\Files-and-Streams-Exercises-Resources\\Exercises Resources";


        System.out.println("Folder size: " + getSizeOfDir(path));
    }

    private static long getSizeOfDir(String path) {
        File file = new File(path);
        long size = 0;
        File[] filesInDir = file.listFiles();
        for (File fileInDir : filesInDir) {
            if (fileInDir.isDirectory()) {
                size+=getSizeOfDir(fileInDir.getPath());
            } else {
                size += fileInDir.length();
            }
        }
        return size;
    }
}
