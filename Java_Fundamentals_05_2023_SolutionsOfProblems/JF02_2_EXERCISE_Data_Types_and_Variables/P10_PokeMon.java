package JF02_2_EXERCISE_Data_Types_and_Variables;

import java.util.Scanner;

public class P10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startPokePower = Integer.parseInt(scanner.nextLine());
        int distanceBetweenTargets = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int pokePower = startPokePower;
        int countOfPokeTargets = 0;

        while (pokePower >= distanceBetweenTargets) {
            pokePower -= distanceBetweenTargets;
            countOfPokeTargets++;
            if ((startPokePower / 2 == pokePower) && (exhaustionFactor != 0)) {
                pokePower /= exhaustionFactor;
            }
        }
        System.out.println(pokePower);
        System.out.println(countOfPokeTargets);
    }
}
