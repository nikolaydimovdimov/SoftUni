package JADV4_2_Ex_Files_and_Streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class P06_WordCount {
    public static void main(String[] args) throws IOException {
        String pathInputW = "C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\Projects\\" +
                "Java_Advanced_09_2023_SolutionOfProblems\\Files-and-Streams-Exercises-Resources\\text.txt";
        String pathInputC = "C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\Projects\\" +
                "Java_Advanced_09_2023_SolutionOfProblems\\Files-and-Streams-Exercises-Resources\\words.txt";
        String pathOutput = "C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\Projects\\" +
                "Java_Advanced_09_2023_SolutionOfProblems\\Files-and-Streams-Exercises-Resources\\results.txt";

        List<String> inputWords=new ArrayList<>();
        Set<String> inputCompare=new HashSet<>();

        BufferedReader inputW=new BufferedReader(new FileReader(pathInputW));
        BufferedReader inputC=new BufferedReader(new FileReader(pathInputC));

        String line=inputW.readLine();

        while (line!=null){
            String[] inputWArray= line.split("(\\s)|(,\\s)|(\\.\\s)");
            Collections.addAll(inputWords, inputWArray);
            line=inputW.readLine();
        }

        line=inputC.readLine();

        while (line!=null){
            String[] inputCArray= line.split("(\\s)|(,\\s)|(\\.\\s)");
            Collections.addAll(inputCompare, inputCArray);
            line=inputC.readLine();
        }
        inputW.close();
        inputC.close();
        Map<String,Integer> wordsMap=new LinkedHashMap<>();

        for (String word : inputWords) {
            if(inputCompare.contains(word)){
                wordsMap.putIfAbsent(word,0);
                wordsMap.put(word,wordsMap.get(word)+1);
            }
        }

        PrintWriter output=new PrintWriter(pathOutput);
        wordsMap.forEach((key,value) -> output.println(key+" - "+value));
        output.close();
    }
}
