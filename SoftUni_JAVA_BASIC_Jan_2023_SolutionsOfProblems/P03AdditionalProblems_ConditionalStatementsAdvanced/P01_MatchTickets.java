package P03AdditionalProblems_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P01_MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String ticketType = scanner.nextLine();
        int numberPeople = Integer.parseInt(scanner.nextLine());

        double transportPrice = 0;
        double ticketPrice = 0;
        if (ticketType.equals("VIP")) {
            ticketPrice = numberPeople * 499.99;
        } else {
            ticketPrice = numberPeople * 249.99;
        }
        if (numberPeople >= 1 && numberPeople <= 4) {
            transportPrice = budget * 0.75;
        } else if (numberPeople <= 9) {
            transportPrice = budget * 0.6;
        } else if (numberPeople <= 24) {
            transportPrice = budget * 0.5;
        } else if (numberPeople <= 49) {
            transportPrice = budget * 0.4;
        } else {
            transportPrice = budget * 0.25;
        }
        if ((transportPrice + ticketPrice) > budget) {
            System.out.printf("Not enough money! You need %.2f leva.", transportPrice + ticketPrice - budget);
        } else {
            System.out.printf("Yes! You have %.2f leva left.", budget - transportPrice - ticketPrice);
        }

    }
}
