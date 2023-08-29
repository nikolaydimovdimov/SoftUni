package JF01_2_EXERCISE_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class P09_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfOrders = Integer.parseInt(scanner.nextLine());

        double pricePerCapsule, orderPrice, totalPrice = 0;
        int days, capsulesCount;

        for (int i = 1; i <= numberOfOrders; i++) {
            pricePerCapsule = Double.parseDouble(scanner.nextLine());
            days = Integer.parseInt(scanner.nextLine());
            capsulesCount = Integer.parseInt(scanner.nextLine());
            orderPrice = pricePerCapsule * days * capsulesCount;
            System.out.printf("The price for the coffee is: $%.2f%n", orderPrice);
            totalPrice += orderPrice;
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
