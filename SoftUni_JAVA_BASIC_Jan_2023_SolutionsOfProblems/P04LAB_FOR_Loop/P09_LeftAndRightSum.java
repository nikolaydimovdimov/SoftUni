package P04LAB_FOR_Loop;

import java.util.Scanner;

public class P09_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0, rightSum = 0;
        if (n > 0) {
            for (int count = 1; count <= n; count++) {
                leftSum += Integer.parseInt(scanner.nextLine());
            }
            for (int count = 1; count <= n; count++) {
                rightSum += Integer.parseInt(scanner.nextLine());
            }
            if (leftSum == rightSum) {
                System.out.printf("Yes, sum = %d", leftSum);
            } else {
                System.out.printf("No, diff = %d", Math.abs(leftSum - rightSum));
            }
        }
    }
}
