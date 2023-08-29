package JF08_LAB_Text_Processing;

import java.util.Scanner;

public class P04_TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (String word : words) {
            String newWord = "*".repeat(word.length());
            text = text.replace(word, newWord);
        }
        System.out.println(text);
    }
}
