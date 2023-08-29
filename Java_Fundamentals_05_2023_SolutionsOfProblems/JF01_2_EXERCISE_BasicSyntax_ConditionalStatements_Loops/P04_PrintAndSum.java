package JF01_2_EXERCISE_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class P04_PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberFirst = Integer.parseInt(scanner.nextLine());
        int numberSecond = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = numberFirst; i <= numberSecond; i++) {
            System.out.printf("%d ", i);
            sum += i;
        }
        System.out.printf("%nSum: %d", sum);
    }
}
