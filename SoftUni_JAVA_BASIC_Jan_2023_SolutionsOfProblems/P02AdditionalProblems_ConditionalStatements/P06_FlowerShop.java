package P02AdditionalProblems_ConditionalStatements;

import java.util.Scanner;

public class P06_FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double amount = (magnolias * 3.25 + hyacinths * 4 + roses * 3.5 + cactus * 8) * 0.95;

        if (giftPrice <= amount)
            System.out.printf("She is left with %.0f leva.", Math.floor(amount - giftPrice));
        else
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(giftPrice - amount));
    }

}
