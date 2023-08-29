package P08_PreExam_19_02;

import java.util.Scanner;

public class P05_HairSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = Integer.parseInt(scanner.nextLine());
        int profit = 0;

        while (profit < target) {
            String service = scanner.nextLine();
            if (service.equals("closed")) {
                break;
            }
            String serviceType = scanner.nextLine();
            if (service.equals("haircut")) {
                if (serviceType.equals("mens")) {
                    profit += 15;
                } else if (serviceType.equals("ladies")) {
                    profit += 20;
                } else {
                    profit += 10;
                }
            } else {
                if (serviceType.equals("touch up")) {
                    profit += 20;
                } else {
                    profit += 30;
                }
            }
        }
        if (profit < target) {
            System.out.printf("Target not reached! You need %dlv. more.%n", target - profit);
        } else {
            System.out.printf("You have reached your target for the day!%n");
        }
        System.out.printf("Earned money: %dlv.", profit);
    }
}
