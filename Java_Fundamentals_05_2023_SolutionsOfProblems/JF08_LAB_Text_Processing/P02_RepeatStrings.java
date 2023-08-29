package JF08_LAB_Text_Processing;

import java.util.Scanner;

public class P02_RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordsArr = scanner.nextLine().split(" ");
        StringBuilder newString = new StringBuilder();
        for (String w : wordsArr) {
            newString.append(w.repeat(w.length()));
        }
        System.out.println(newString);
    }
}
