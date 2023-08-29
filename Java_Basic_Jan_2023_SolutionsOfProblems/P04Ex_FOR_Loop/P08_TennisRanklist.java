package P04Ex_FOR_Loop;

import java.util.Scanner;

public class P08_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        String level = "";
        int points = 0, wins = 0;
        for (int count = 0; count < tournaments; count++) {
            level = scanner.nextLine();
            switch (level) {
                case "W":
                    points += 2000;
                    wins++;
                    break;
                case "F":
                    points += 1200;
                    break;
                case "SF":
                    points += 720;
                    break;
            }
        }
        System.out.printf("Final points: %d%n", points + startPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(points * 1.0 / tournaments));
        System.out.printf("%.2f%%", wins * 100.0 / tournaments);
    }
}
