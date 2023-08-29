package P04Ex_FOR_Loop;

import java.util.Scanner;

public class P02_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int number = 0, sum = 0, maxNumber = Integer.MIN_VALUE;
        for (int count = 1; count <= n; count++) {
            number = Integer.parseInt(scanner.nextLine());
            if (number > maxNumber) {
                maxNumber = number;
            }
            sum += number;
        }
        if ((sum - maxNumber) == maxNumber) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxNumber);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(maxNumber - (sum - maxNumber)));
        }

    }
}
