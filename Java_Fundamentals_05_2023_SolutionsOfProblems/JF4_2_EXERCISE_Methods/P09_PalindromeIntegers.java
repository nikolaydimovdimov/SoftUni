package JF4_2_EXERCISE_Methods;

import java.util.Scanner;

public class P09_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            int inputNumber = Integer.parseInt(input);

            if (inputNumber == backwardNumber(inputNumber)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            input = scanner.nextLine();
        }
    }

    public static int backwardNumber(int number) {
        int newNumber = number;

        int powerOf10 = 1;
        newNumber /= 10;

        while (newNumber > 0) {
            powerOf10 *= 10;
            newNumber /= 10;
        }

        while (number > 0) {
            newNumber += powerOf10 * (number % 10);
            number /= 10;
            powerOf10 /= 10;
        }
        return newNumber;
    }
}
