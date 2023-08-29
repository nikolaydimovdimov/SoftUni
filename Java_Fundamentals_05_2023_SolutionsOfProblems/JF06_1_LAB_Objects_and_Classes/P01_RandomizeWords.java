package JF06_1_LAB_Objects_and_Classes;

import java.util.Random;
import java.util.Scanner;

public class P01_RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");

        Random rnd = new Random();

        for (int i = 0; i < words.length; i++) {
            int newIndex = rnd.nextInt(words.length);
            String saveWord = words[newIndex];
            words[newIndex] = words[i];
            words[i] = saveWord;
        }
        System.out.println(String.join(System.lineSeparator(), words));
    }
}
