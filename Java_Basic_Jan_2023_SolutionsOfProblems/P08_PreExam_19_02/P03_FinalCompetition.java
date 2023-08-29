package P08_PreExam_19_02;

import java.util.Scanner;

public class P03_FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberDancers = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();

        double prize = numberDancers * points;
        if (place.equals("Bulgaria")) {
            if (season.equals("summer")) {
                prize *= 0.95;
            } else {
                prize *= 0.92;
            }
        } else {
            prize *= 1.5;
            if (season.equals("summer")) {
                prize *= 0.9;
            } else {
                prize *= 0.85;
            }
        }
        System.out.printf("Charity - %.2f%n", prize * 0.75);
        System.out.printf("Money per dancer - %.2f", prize * 0.25 / numberDancers);
    }
}
