package P01Ex_FirstStepsInCoding;

import java.util.Scanner;

public class P05_SuppliesForSchool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pensPackages = Integer.parseInt(scanner.nextLine());
        int markersPackages = Integer.parseInt(scanner.nextLine());
        int cleaningAgentLrs = Integer.parseInt(scanner.nextLine());
        int discountPercent = Integer.parseInt(scanner.nextLine());

        double amount = (pensPackages * 5.8 + markersPackages * 7.2 + cleaningAgentLrs * 1.2) *
                (1 - discountPercent * 1.0 / 100);

        System.out.println(amount);
    }
}
