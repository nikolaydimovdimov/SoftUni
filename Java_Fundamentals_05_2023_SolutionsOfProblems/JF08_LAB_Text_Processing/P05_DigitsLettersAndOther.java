package JF08_LAB_Text_Processing;

import java.util.Scanner;

public class P05_DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        StringBuilder numbers = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isDigit(ch)) {
                numbers.append(ch);
            } else if (Character.isLetter(ch)) {
                letters.append(ch);
            } else {
                symbols.append(ch);
            }
        }

        System.out.println(numbers);
        System.out.println(letters);
        System.out.println(symbols);
    }
}
