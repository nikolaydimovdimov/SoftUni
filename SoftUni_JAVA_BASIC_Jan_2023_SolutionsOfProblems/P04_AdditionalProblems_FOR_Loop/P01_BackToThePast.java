package P04_AdditionalProblems_FOR_Loop;

import java.util.Scanner;

public class P01_BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inheritedMoney = Double.parseDouble(scanner.nextLine());
        double money = 0;
        int lastYear = Integer.parseInt(scanner.nextLine());
        for (int year = 1800; year <= lastYear; year++) {
            money += 12000;
            if (!(year % 2 == 0)) {
                money += (18 + year - 1800) * 50;
            }
        }
        if (money <= inheritedMoney) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left."
                    , inheritedMoney - money);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", money - inheritedMoney);
        }
    }
}
