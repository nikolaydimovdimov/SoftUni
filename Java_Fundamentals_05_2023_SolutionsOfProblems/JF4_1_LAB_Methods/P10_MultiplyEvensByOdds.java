package JF4_1_LAB_Methods;

import java.util.Scanner;

public class P10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(sumEven(number) * sumOdd(number));
    }

    public static int sumEven(int number) {
        number = Math.abs(number);
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;

            if (digit % 2 == 0) {
                sum += digit;
            }

            number /= 10;
        }
        return sum;
    }

    public static int sumOdd(int number) {
        number = Math.abs(number);
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;

            if (digit % 2 != 0) {
                sum += digit;
            }

            number /= 10;
        }
        return sum;
    }
}
