package P03AdditionalProblems_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P06_TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmPerMount = Double.parseDouble(scanner.nextLine());
        double salary = 0;

        if (kmPerMount <= 5000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    salary = kmPerMount * 0.75;
                    break;
                case "Summer":
                    salary = kmPerMount * 0.9;
                    break;
                case "Winter":
                    salary = kmPerMount * 1.05;
                    break;
            }
        } else if (kmPerMount <= 10000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    salary = kmPerMount * 0.95;
                    break;
                case "Summer":
                    salary = kmPerMount * 1.1;
                    break;
                case "Winter":
                    salary = kmPerMount * 1.25;
                    break;
            }
        } else {
            salary = kmPerMount * 1.45;
        }
        salary = salary * 4 * 0.9;
        System.out.printf("%.2f", salary);
    }
}
