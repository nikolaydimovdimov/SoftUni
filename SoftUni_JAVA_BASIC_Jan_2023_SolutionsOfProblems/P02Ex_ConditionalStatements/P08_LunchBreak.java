package P02Ex_ConditionalStatements;

import java.util.Scanner;

public class P08_LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfFilm = scanner.nextLine();
        int durationOfFilm = Integer.parseInt(scanner.nextLine());
        int durationOfRest = Integer.parseInt(scanner.nextLine());

        double time = durationOfRest * (1 - 1 / 8.0 - 1 / 4.0);

        if (time < durationOfFilm)
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", nameOfFilm,
                    Math.ceil(durationOfFilm - time));
        else
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameOfFilm,
                    Math.ceil(time - durationOfFilm));
    }
}
