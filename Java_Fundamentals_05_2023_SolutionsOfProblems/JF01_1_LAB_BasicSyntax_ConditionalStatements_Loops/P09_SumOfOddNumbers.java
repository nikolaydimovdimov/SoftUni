package JF01_1_LAB_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class P09_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int oddNumber = 1;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println(oddNumber);
            sum += oddNumber;
            oddNumber += 2;
        }
        System.out.printf("Sum: %d", sum);
    }
}
