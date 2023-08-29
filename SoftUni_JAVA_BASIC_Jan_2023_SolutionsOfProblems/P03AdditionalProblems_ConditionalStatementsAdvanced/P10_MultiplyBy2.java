package P03AdditionalProblems_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P10_MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = 0;
        do {
            number = Double.parseDouble(scanner.nextLine());
            if (number < 0) {
                System.out.println("Negative number!");
            } else {
                System.out.printf("Result: %.2f%n", number * 2);
            }
        } while (number >= 0);
    }
}
