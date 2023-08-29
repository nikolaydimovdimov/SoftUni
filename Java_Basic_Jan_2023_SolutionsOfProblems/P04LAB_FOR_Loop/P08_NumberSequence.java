package P04LAB_FOR_Loop;

import java.util.Scanner;

public class P08_NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n > 0) {
            int maxNumber = Integer.MIN_VALUE;
            int minNumber = Integer.MAX_VALUE;
            int number = 0;
            for (; n > 0; n--) {
                number = Integer.parseInt(scanner.nextLine());
                if (number < minNumber) {
                    minNumber = number;
                }
                if (number > maxNumber) {
                    maxNumber = number;
                }
            }
            System.out.printf("Max number: %d%n", maxNumber);
            System.out.printf("Min number: %d", minNumber);
        }
    }
}
