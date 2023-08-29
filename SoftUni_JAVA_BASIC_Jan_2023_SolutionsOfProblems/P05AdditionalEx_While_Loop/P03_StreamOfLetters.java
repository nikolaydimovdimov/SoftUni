package P05AdditionalEx_While_Loop;

import java.util.Scanner;

public class P03_StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String secretWord = "", text = "", test = "";
        boolean charExist = false;
        int asciiValue = 0;
        while (!input.equals("End")) {
            asciiValue = input.charAt(0);
            if (!(asciiValue > 64 && asciiValue < 91) && !(asciiValue > 96 && asciiValue < 123)) {
                input = scanner.nextLine();
                continue;
            }
            if (input.equals("c") || input.equals("o") || input.equals("n")) {
                charExist = false;
                for (int count = 0; count < secretWord.length(); count++) {
                    test += secretWord.charAt(count);
                    if (input.equals(test)) {
                        charExist = true;
                    }
                    test = "";
                }
                if (!charExist) {
                    secretWord = secretWord + input;
                } else {
                    text = text + input;
                }
            } else {
                text = text + input;
            }
            if (secretWord.length() == 3) {
                secretWord = "";
                System.out.print(text + " ");
                text = "";
            }
            input = scanner.nextLine();
        }
    }
}
