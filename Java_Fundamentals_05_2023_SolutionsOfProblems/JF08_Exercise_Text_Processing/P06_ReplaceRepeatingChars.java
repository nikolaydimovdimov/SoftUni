package JF08_Exercise_Text_Processing;

import java.util.Scanner;

public class P06_ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder inputString = new StringBuilder();
        inputString.append(scanner.nextLine());
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            for (int j = i + 1; j < inputString.length(); j++) {
                if (inputString.charAt(j) == ch) {
                    inputString.deleteCharAt(j);
                    j--;
                } else break;
            }
        }
        System.out.println(inputString);
    }
}
