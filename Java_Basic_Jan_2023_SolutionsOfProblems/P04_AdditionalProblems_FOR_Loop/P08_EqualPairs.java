package P04_AdditionalProblems_FOR_Loop;

import java.util.Scanner;

public class P08_EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberPairs = Integer.parseInt(scanner.nextLine());
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int newSum = 0, maxDiff = 0;
        int oldSum = number1 + number2;
        if (numberPairs > 1) {
            maxDiff = Integer.MIN_VALUE;
            for (; numberPairs > 1; numberPairs--) {
                number1 = Integer.parseInt(scanner.nextLine());
                number2 = Integer.parseInt(scanner.nextLine());
                newSum = number1 + number2;
                if (Math.abs(newSum - oldSum) > maxDiff) {
                    maxDiff = Math.abs(newSum - oldSum);
                }
                oldSum = newSum;
            }
        }
        if (maxDiff == 0) {
            System.out.printf("Yes, value=%d", oldSum);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}
