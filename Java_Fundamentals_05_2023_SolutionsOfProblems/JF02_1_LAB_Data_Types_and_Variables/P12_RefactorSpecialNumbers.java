package JF02_1_LAB_Data_Types_and_Variables;

import java.util.Scanner;

public class P12_RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            int currentNumber = i;
            int sumOfDigits = 0;
            while (currentNumber > 0) {
                sumOfDigits += currentNumber % 10;
                currentNumber = currentNumber / 10;
            }
            boolean isSpecial = (sumOfDigits == 5) || (sumOfDigits == 7) || (sumOfDigits == 11);
            if (isSpecial) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}
