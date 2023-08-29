package JF07_LAB_Associative_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P04_WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] evenWords = Arrays
                .stream(scanner.nextLine().split(" "))
                .filter(word -> word.length() % 2 == 0)
                .toArray(String[]::new);

        System.out.println(String.join(System.lineSeparator(), evenWords));
    }
}
