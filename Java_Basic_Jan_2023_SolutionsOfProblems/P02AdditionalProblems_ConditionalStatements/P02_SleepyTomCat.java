package P02AdditionalProblems_ConditionalStatements;

import java.util.Scanner;

public class P02_SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int holidays = Integer.parseInt(scanner.nextLine());

        int timePlay = 365 * 63 + holidays * 64;

        if (timePlay > 30000) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play",
                    (timePlay - 30000) / 60, (timePlay - 30000) % 60);
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play",
                    (30000 - timePlay) / 60, (30000 - timePlay) % 60);
        }
    }
}
