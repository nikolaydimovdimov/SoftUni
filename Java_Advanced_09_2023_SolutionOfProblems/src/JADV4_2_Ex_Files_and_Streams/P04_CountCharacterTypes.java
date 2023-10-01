package JADV4_2_Ex_Files_and_Streams;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class P04_CountCharacterTypes {
    public static void  main(String[] args){
        Set<Character> vowelsSet=new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u' ));
        Set<Character> punctuationSet=new HashSet<>(Set.of('!',',','.','?'));

        String pathInput = "C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\Projects\\" +
                "Java_Advanced_09_2023_SolutionOfProblems\\Files-and-Streams-Exercises-Resources\\input.txt";
        String pathOutput = "C:\\Users\\niki_\\Desktop\\SoftUni_JAVA_ADVANCED_9.2023\\Projects\\" +
                "Java_Advanced_09_2023_SolutionOfProblems\\Files-and-Streams-Exercises-Resources\\output2.txt";


        try (BufferedReader input=new BufferedReader(new FileReader(pathInput))){

            PrintWriter output=new PrintWriter(new FileWriter(pathOutput));

            String currentLine=input.readLine();
            int countVowels=0, countPunctuation=0, countOthers=0;
            while (currentLine!=null){
                for (int i = 0; i < currentLine.length(); i++) {
                    char currentChar=currentLine.charAt(i);
                    if(currentChar==' ') continue;
                    if(vowelsSet.contains(currentChar)){
                        countVowels++;
                    } else if (punctuationSet.contains(currentChar)) {
                        countPunctuation++;
                    }else {
                        countOthers++;
                    }
                }
                currentLine=input.readLine();
            }
            output.println("Vowels: "+countVowels);
            output.println("Other symbols: " + countOthers);
            output.println("Punctuation: " + countPunctuation);
            input.close();
            output.close();

        }catch (IOException e){
            System.out.println("ERROR - File " + pathInput);
        }


    }
}
