package P02Ex_ConditionalStatements;

import java.util.Scanner;

public class P02_BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int points = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if (points <= 100) bonus = 5;
        else if (points <= 1000) bonus = points * 0.2;
        else bonus = points * 0.1;

        if (points % 2 == 0) bonus = bonus + 1;
        if (points % 10 == 5) bonus = bonus + 2;

        System.out.printf("%.1f%n", bonus);
        System.out.printf("%.1f", bonus + points);
    }
}
