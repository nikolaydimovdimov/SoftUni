package P04LAB_FOR_Loop;

import java.util.Scanner;

public class P10_Even_Odd_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int evenSum = 0, oddSum = 0;
        for (; n > 0; n--) {
            if (n % 2 == 0) {
                evenSum += Integer.parseInt(scanner.nextLine());
            } else {
                oddSum += Integer.parseInt(scanner.nextLine());
            }
        }
        if (evenSum == oddSum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", evenSum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(evenSum - oddSum));
        }
    }
}
