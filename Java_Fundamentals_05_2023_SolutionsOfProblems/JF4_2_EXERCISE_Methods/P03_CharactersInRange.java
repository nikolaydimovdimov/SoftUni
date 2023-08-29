package JF4_2_EXERCISE_Methods;

import java.util.Scanner;

public class P03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbolOne = scanner.nextLine().charAt(0);
        char symbolTwo = scanner.nextLine().charAt(0);

        printCharactersInRange(symbolOne, symbolTwo);

    }

    public static void printCharactersInRange(char chOne, char chTwo) {
        if (chTwo > chOne) {
            for (int i = 1; i < chTwo - chOne; i++) {
                System.out.printf("%c ", chOne + i);
            }
        } else {
            for (int i = 1; i < chOne - chTwo; i++) {
                System.out.printf("%c ", chTwo + i);
            }
        }
    }
}

