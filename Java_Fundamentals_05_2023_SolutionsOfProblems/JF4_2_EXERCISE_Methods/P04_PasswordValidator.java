package JF4_2_EXERCISE_Methods;

import java.util.Scanner;

public class P04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] passWord = scanner.nextLine().toCharArray();
        boolean isPassValid = true;

        if (!isPassLengthCorrect(passWord)) {
            System.out.println("Password must be between 6 and 10 characters");
            isPassValid = false;
        }
        if (!isPassContentCorrect(passWord)) {
            System.out.println("Password must consist only of letters and digits");
            isPassValid = false;
        }
        if (!isPassContainsDigits(passWord)) {
            System.out.println("Password must have at least 2 digits");
            isPassValid = false;
        }
        if (isPassValid) {
            System.out.println("Password is valid");
        }
    }

    public static boolean isPassLengthCorrect(char[] pass) {
        return (pass.length >= 6 && pass.length <= 10);
    }

    public static boolean isPassContentCorrect(char[] pass) {
        for (char ch : pass) {
            int chCode = (int) ch;
            if ((chCode < 48 || chCode > 57) && (chCode < 65 || chCode > 90)
                    && (chCode < 97 || chCode > 122)) return false;
        }
        return true;
    }

    public static boolean isPassContainsDigits(char[] pass) {
        int digitsCount = 0;
        for (char ch : pass) {
            int chCode = (int) ch;
            if (chCode >= 48 && chCode <= 57) digitsCount++;
        }
        return (digitsCount >= 2);
    }

}
