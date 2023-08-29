package P03LABConditionalStatements_Advanced;

import java.util.Scanner;

public class P12_TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        if (city.equals("Sofia")) {
            if (sales < 0) {
                System.out.println("error");
            } else if (sales <= 500) {
                System.out.printf("%.2f", sales * 0.05);
            } else if (sales <= 1000) {
                System.out.printf("%.2f", sales * 0.07);
            } else if (sales <= 10000) {
                System.out.printf("%.2f", sales * 0.08);
            } else {
                System.out.printf("%.2f", sales * 0.12);
            }
        } else if (city.equals("Varna")) {
            if (sales < 0) {
                System.out.println("error");
            } else if (sales <= 500) {
                System.out.printf("%.2f", sales * 0.045);
            } else if (sales <= 1000) {
                System.out.printf("%.2f", sales * 0.075);
            } else if (sales <= 10000) {
                System.out.printf("%.2f", sales * 0.10);
            } else {
                System.out.printf("%.2f", sales * 0.13);
            }
        } else if (city.equals("Plovdiv")) {
            if (sales < 0) {
                System.out.println("error");
            } else if (sales <= 500) {
                System.out.printf("%.2f", sales * 0.055);
            } else if (sales <= 1000) {
                System.out.printf("%.2f", sales * 0.08);
            } else if (sales <= 10000) {
                System.out.printf("%.2f", sales * 0.12);
            } else {
                System.out.printf("%.2f", sales * 0.145);
            }
        } else System.out.println("error");
    }
}
