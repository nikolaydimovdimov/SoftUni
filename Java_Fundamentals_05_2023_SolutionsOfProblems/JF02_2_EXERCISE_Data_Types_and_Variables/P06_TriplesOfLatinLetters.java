package JF02_2_EXERCISE_Data_Types_and_Variables;

import java.util.Scanner;

public class P06_TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short numberOfLetters = Short.parseShort(scanner.nextLine());
        for (short count1 = 0; count1 < numberOfLetters; count1++) {
            for (short count2 = 0; count2 < numberOfLetters; count2++) {
                for (short count3 = 0; count3 < numberOfLetters; count3++) {
                    System.out.printf("%c%c%c%n", 'a' + count1, 'a' + count2, 'a' + count3);
                }
            }
        }
    }
}

