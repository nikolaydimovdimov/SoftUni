package JF08_Exercise_Text_Processing;

import java.util.Scanner;

public class P08_LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringsArr = scanner.nextLine().split("\\s+");
        double result = 0;

        for (String str : stringsArr) {
            int number = Integer.parseInt(str.substring(1, str.length() - 1));

            if (Character.isUpperCase(str.charAt(0))) {
                result += number * 1.0 / ((int) str.charAt(0) - 64);
            } else {
                result += number * 1.0 * ((int) str.charAt(0) - 96);
            }

            if (Character.isUpperCase(str.charAt(str.length() - 1))) {
                result -= ((int) str.charAt(str.length() - 1) - 64);
            } else {
                result += ((int) str.charAt(str.length() - 1) - 96);
            }
        }
        System.out.printf("%.2f", result);
    }
}
