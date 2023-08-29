package JF01_1_LAB_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class P12_EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isEven = false;
        int number = 0;
        do {
            number = Integer.parseInt(scanner.nextLine());
            isEven = (number % 2 == 0);
            if (!isEven) {
                System.out.println("Please write an even number.");
            }
        } while (!isEven);
        System.out.printf("The number is: %d", Math.abs(number));
    }
}
