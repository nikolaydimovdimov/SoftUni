package JF02_2_EXERCISE_Data_Types_and_Variables;

import java.util.Scanner;

public class P05_PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short startCharIndex = Short.parseShort(scanner.nextLine());
        short endCharIndex = Short.parseShort(scanner.nextLine());
        for (short i = startCharIndex; i <= endCharIndex; i++) {
            System.out.print((char) i + " ");
        }
    }
}
