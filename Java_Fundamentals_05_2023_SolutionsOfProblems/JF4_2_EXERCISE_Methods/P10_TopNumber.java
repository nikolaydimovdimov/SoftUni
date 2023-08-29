package JF4_2_EXERCISE_Methods;

import java.util.Scanner;

public class P10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= inputNumber; i++) {
            if (isTopNumber(i)) System.out.println(i);
        }

    }

    public static boolean isTopNumber(int number) {
        int sumDigits = 0;
        boolean isThereOddNumber = false;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) isThereOddNumber = true;
            sumDigits += digit;
            number /= 10;
        }
        return (sumDigits % 8 == 0 && isThereOddNumber);
    }
}
