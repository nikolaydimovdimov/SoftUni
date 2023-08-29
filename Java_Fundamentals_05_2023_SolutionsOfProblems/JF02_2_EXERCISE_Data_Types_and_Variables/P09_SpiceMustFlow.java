package JF02_2_EXERCISE_Data_Types_and_Variables;

import java.util.Scanner;

public class P09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yieldSpice = Integer.parseInt(scanner.nextLine());
        int totalAmountSpice = 0;
        int workingDays = 0;

        while (yieldSpice >= 100) {
            workingDays++;
            totalAmountSpice += (yieldSpice - 26);
            yieldSpice -= 10;
        }
        if (totalAmountSpice > 0) {
            totalAmountSpice -= 26;
        }
        System.out.println(workingDays);
        System.out.print(totalAmountSpice);
    }
}
