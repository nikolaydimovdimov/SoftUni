package JF01_2_EXERCISE_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class P11_RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double totalPrice = (lostGamesCount / 2) * headsetPrice +
                (lostGamesCount / 3) * mousePrice + (lostGamesCount / 6) * keyboardPrice +
                ((lostGamesCount / 6) / 2) * displayPrice;

        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
