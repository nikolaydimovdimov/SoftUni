package JADV5_1_LAB_Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P03_CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> isUpperCaseWord = word -> Character.isUpperCase(word.charAt(0));

        List<String> wordsArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(String::valueOf)
                .filter(w -> isUpperCaseWord.test(w))
                .collect(Collectors.toList());

        System.out.println(wordsArr.size());
        System.out.println(String.join(System.lineSeparator(), wordsArr));

    }
}
