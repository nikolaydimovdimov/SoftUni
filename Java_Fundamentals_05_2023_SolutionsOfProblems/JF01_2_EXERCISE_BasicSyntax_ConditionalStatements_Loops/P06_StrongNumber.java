package JF01_2_EXERCISE_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class P06_StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scanner.nextLine());
        int number = inputNumber;
        int digit = 0;
        int factorial = 1;
        int sumFactorial = 0;

        do {
            digit = number % 10;
            number /= 10;
            if (digit > 1) {
                for (int i = 1; i <= digit; i++) {
                    factorial *= i;
                }
            }
            sumFactorial += factorial;
            factorial = 1;
        } while (number > 0);

        if (sumFactorial == inputNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
