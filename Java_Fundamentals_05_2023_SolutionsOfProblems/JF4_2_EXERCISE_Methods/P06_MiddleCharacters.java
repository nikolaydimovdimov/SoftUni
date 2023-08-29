package JF4_2_EXERCISE_Methods;

import java.util.Scanner;

public class P06_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        printMiddleCharacter(inputString);
    }

    public static void printMiddleCharacter(String text) {
        int length = text.length();

        if (length % 2 == 0) {
            length /= 2;
            System.out.println("" + text.charAt(length - 1) + text.charAt(length));
        } else {
            System.out.println(text.charAt(length / 2));
        }
    }
}
