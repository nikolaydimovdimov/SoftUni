package JF4_2_EXERCISE_Methods;

import java.util.Scanner;

public class P02_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        printCountVowelsChar(inputString);
    }

    public static void printCountVowelsChar(String text) {

        String vowelsChar = "aeiou";
        text = text.toLowerCase();
        String[] textArr = text.split("");
        int counter = 0;

        for (String s : textArr) {
            if (vowelsChar.contains(s)) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
