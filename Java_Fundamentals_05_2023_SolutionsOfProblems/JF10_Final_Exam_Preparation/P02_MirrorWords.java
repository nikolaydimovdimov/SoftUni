package JF10_Final_Exam_Preparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> wordList = new ArrayList<>();

        String rgx = "([#@])(?<word1>[A-Za-z]{3,})\\1{2}(?<word2>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(rgx);
        int countPairs = 0;
        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            matcher = pattern.matcher(input);
            while (matcher.find()) {
                countPairs++;
                String word1 = matcher.group("word1");
                String word2 = matcher.group("word2");
                if (word1.equals(reverseWord(word2))) {
                    wordList.add(word1 + " <=> " + word2);
                }
            }
        } else {
            System.out.println("No word pairs found!");
        }
        if (countPairs != 0) {
            System.out.printf("%d word pairs found!%n", countPairs);
        }
        if (!wordList.isEmpty()) {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", wordList));
        } else {
            System.out.println("No mirror words!");
        }
    }


    public static String reverseWord(String word) {
        int length = word.length();
        String reversedWord = "";
        for (int i = length - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        return reversedWord;
    }
}
