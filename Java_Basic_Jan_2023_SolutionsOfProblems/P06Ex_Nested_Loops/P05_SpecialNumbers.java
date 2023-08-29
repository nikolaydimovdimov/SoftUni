package P06Ex_Nested_Loops;

import java.util.Scanner;

public class P05_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int currentNumber = 1111; currentNumber < 10000; currentNumber++) {
            int processedNumber = currentNumber;
            boolean divFlag = true;
            while (processedNumber > 0) {
                int divisor = processedNumber % 10;
                processedNumber = processedNumber / 10;
                if (divisor == 0 || number % divisor != 0) {
                    divFlag = false;
                    break;
                }
            }
            if (divFlag) {
                System.out.print(currentNumber + " ");
            }
        }
    }
}
