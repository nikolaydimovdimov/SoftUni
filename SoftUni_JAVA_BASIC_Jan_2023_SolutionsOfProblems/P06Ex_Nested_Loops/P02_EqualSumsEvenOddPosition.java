package P06Ex_Nested_Loops;

import java.util.Scanner;

public class P02_EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int oddSum = 0, evenSum = 0, currentNumber = 0, position = 0;
        for (int i = number1; i <= number2; i++) {
            currentNumber = i;
            position = 1;
            oddSum = 0;
            evenSum = 0;
            while (currentNumber > 0) {
                if (position % 2 == 0) {
                    evenSum += currentNumber % 10;
                } else {
                    oddSum += currentNumber % 10;
                }
                position++;
                currentNumber = currentNumber / 10;
            }
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }
        }
    }
}
