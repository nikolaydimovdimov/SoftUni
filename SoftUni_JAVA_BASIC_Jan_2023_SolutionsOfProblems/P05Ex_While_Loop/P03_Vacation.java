package P05Ex_While_Loop;

import java.util.Scanner;

public class P03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceTrip = Double.parseDouble(scanner.nextLine());
        double savedMoney = Double.parseDouble(scanner.nextLine());

        int daysSpend = 0, daysTotal = 0;
        double money = 0;
        String action = "";

        while (savedMoney < priceTrip && daysSpend < 5) {
            action = scanner.nextLine();
            money = Double.parseDouble(scanner.nextLine());
            daysTotal++;
            if (action.equals("spend")) {
                daysSpend++;
                savedMoney -= money;
                if (savedMoney < 0) {
                    savedMoney = 0;
                }
            } else {
                daysSpend = 0;
                savedMoney += money;
            }
        }
        if (daysSpend == 5) {
            System.out.printf("You can't save the money.%n%d", daysTotal);
        } else {
            System.out.printf("You saved the money for %d days.", daysTotal);
        }
    }
}
