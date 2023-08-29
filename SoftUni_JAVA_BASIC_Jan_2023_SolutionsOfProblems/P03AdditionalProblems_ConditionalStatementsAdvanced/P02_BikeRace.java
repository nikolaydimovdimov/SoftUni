package P03AdditionalProblems_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P02_BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberJuniorBikers = Integer.parseInt(scanner.nextLine());
        int numberSeniorBikers = Integer.parseInt(scanner.nextLine());
        String routeType = scanner.nextLine();
        double donationSum = 0;

        switch (routeType) {
            case "trail":
                donationSum = numberJuniorBikers * 5.5 + numberSeniorBikers * 7.0;
                break;
            case "cross-country":
                donationSum = numberJuniorBikers * 8.0 + numberSeniorBikers * 9.5;
                if ((numberJuniorBikers + numberSeniorBikers) >= 50) {
                    donationSum = donationSum * 0.75;
                }
                break;
            case "downhill":
                donationSum = numberJuniorBikers * 12.25 + numberSeniorBikers * 13.75;
                break;
            case "road":
                donationSum = numberJuniorBikers * 20.0 + numberSeniorBikers * 21.5;
                break;
        }
        donationSum = donationSum * 0.95;
        System.out.printf("%.2f", donationSum);
    }
}
