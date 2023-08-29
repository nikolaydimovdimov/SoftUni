package P06LAB_Nested_Loop;

import java.util.Scanner;

public class P04_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNumber = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int combinations = 0;
        boolean founded = false;
        for (int n1 = minNumber; n1 <= maxNumber; n1++) {
            for (int n2 = minNumber; n2 <= maxNumber; n2++) {
                combinations++;
                if (n1 + n2 == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinations, n1, n2, magicNumber);
                    founded = true;
                    break;
                }
            }
            if (founded) {
                break;
            }
        }
        if (!founded) {
            System.out.printf("%d combinations - neither equals %d", combinations, magicNumber);
        }
    }
}
