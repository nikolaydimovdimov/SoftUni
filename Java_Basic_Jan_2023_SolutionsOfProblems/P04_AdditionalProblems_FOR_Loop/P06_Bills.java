package P04_AdditionalProblems_FOR_Loop;

import java.util.Scanner;

public class P06_Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mounts = Integer.parseInt(scanner.nextLine());
        double elBill = 0, sumBills = 0;
        for (int count = 0; count < mounts; count++) {
            elBill = Double.parseDouble(scanner.nextLine());
            sumBills += elBill;
        }
        System.out.printf("Electricity: %.2f lv%n", sumBills);
        System.out.printf("Water: %.2f lv%n", mounts * 20.0);
        System.out.printf("Internet: %.2f lv%n", mounts * 15.0);
        System.out.printf("Other: %.2f lv%n", (sumBills + mounts * 35.0) * 1.2);
        System.out.printf("Average: %.2f lv%n", (sumBills + mounts * 35.0) * 2.2 / mounts);
    }
}
