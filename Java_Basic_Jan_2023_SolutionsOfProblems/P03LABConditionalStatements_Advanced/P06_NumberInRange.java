package P03LABConditionalStatements_Advanced;

import java.util.Scanner;

public class P06_NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());

        if (Math.abs(number) <= 100 && number != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
