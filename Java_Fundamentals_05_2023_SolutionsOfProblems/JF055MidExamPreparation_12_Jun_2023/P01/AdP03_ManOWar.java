package JF055MidExamPreparation_12_Jun_2023.P01;

import java.util.Arrays;
import java.util.Scanner;

public class AdP03_ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] pirateShip = Arrays
                .stream(scanner.nextLine().split(">"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] warShip = Arrays
                .stream(scanner.nextLine().split(">"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int maxHealth = Integer.parseInt(scanner.nextLine());

        boolean isBattleEnd = false;

        String command = scanner.nextLine();

        while (!command.equals("Retire")) {
            String[] commandEl = command.split(" ");

            if (commandEl[0].equals("Fire")) {

                int index = Integer.parseInt(commandEl[1]);
                if (isIndexValid(warShip, index)) {
                    int damage = Integer.parseInt((commandEl[2]));
                    if (isShipSunken(warShip, index, damage)) {
                        System.out.println("You won! The enemy ship has sunken.");
                        isBattleEnd = true;
                        break;
                    }
                }
            } else if (commandEl[0].equals("Defend")) {
                int index = Integer.parseInt(commandEl[1]);
                int endIndex = Integer.parseInt(commandEl[2]);
                if (isIndexValid(pirateShip, index) && isIndexValid(pirateShip, endIndex)) {
                    int damage = Integer.parseInt(commandEl[3]);
                    for (int i = index; i <= endIndex; i++) {
                        if (isShipSunken(pirateShip, i, damage)) {
                            System.out.println("You lost! The pirate ship has sunken.");
                            isBattleEnd = true;
                            break;
                        }
                    }
                    if (isBattleEnd) break;
                }

            } else if (commandEl[0].equals("Repair")) {
                int index = Integer.parseInt(commandEl[1]);
                if (isIndexValid(warShip, index)) {
                    int health = Integer.parseInt(commandEl[2]);
                    pirateShip[index] = Math.min(maxHealth, pirateShip[index] + health);
                }
            } else if (commandEl[0].equals("Status")) {
                int count = 0;
                double minHealth = maxHealth * 0.2;
                for (int se : pirateShip) {
                    if (se < minHealth) count++;
                }
                System.out.printf("%d sections need repair.%n", count);
            }

            command = scanner.nextLine();
        }
        if (!isBattleEnd) {
            System.out.printf("Pirate ship status: %d%n", sumOfShip(pirateShip));
            System.out.printf("Warship status: %d%n", sumOfShip(warShip));
        }


    }


    public static boolean isIndexValid(int[] sendArr, int index) {
        return (index >= 0 && index < sendArr.length);
    }

    public static boolean isShipSunken(int[] sendArr, int index, int damage) {
        sendArr[index] -= damage;
        return (sendArr[index] <= 0);
    }

    public static int sumOfShip(int[] sendArr) {
        int sum = 0;
        for (int se : sendArr) {
            sum += se;
        }
        return sum;
    }

}
