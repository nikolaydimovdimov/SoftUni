package P01Ex_FirstStepsInCoding;

import java.util.Scanner;

public class P03_DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interestPercent = Double.parseDouble(scanner.nextLine()) / 100;
        double sum = deposit + months * (deposit * interestPercent) / 12;
        System.out.println(sum);
    }
}
