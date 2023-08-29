package P06LAB_Nested_Loop;

import java.util.Scanner;

public class P05_Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        double budget = 0, savedMoney = 0;
        while (!destination.equals("End")) {
            budget = Double.parseDouble(scanner.nextLine());
            while (savedMoney < budget) {
                savedMoney += Double.parseDouble(scanner.nextLine());
            }
            System.out.printf("Going to %s!%n", destination);
            savedMoney = 0;
            destination = scanner.nextLine();
        }
    }
}
