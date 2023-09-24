package JADV2_2_Ex_Multidimensional_Arrays;

import java.util.Scanner;

public class P08_TheHeiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cloudExpire = 0;
        int[][] cloudArea = new int[9][2];
        int[][] eruptionArea = new int[9][2];
        int[] playerPosition = new int[2];
        playerPosition[0] = 7;
        playerPosition[1] = 7;
        int playerPoints = 18500;
        double heiganPoints = 3000000;
        double heiganDamage = Double.parseDouble(scanner.nextLine());
        String spell = "";

        while (playerPoints > 0 && heiganPoints > 0) {
            heiganPoints -= heiganDamage;
            if (cloudExpire == 1) {
                cloudExpire = 0;
                playerPoints -= 3500;
                if (playerPoints <= 0 || heiganPoints <= 0) break;
            }
            String[] hit = scanner.nextLine().split("\\s+");
            int[] hitPoint = new int[2];
            spell = hit[0];
            hitPoint[0] = Integer.parseInt(hit[1]);
            hitPoint[1] = Integer.parseInt(hit[2]);
            if (spell.equals("Cloud")) {
                fillMatrix(cloudArea, hitPoint);

                if (isPlayerUnderHit(cloudArea, playerPosition)) {
                    if (!movePlayer(cloudArea, playerPosition)) {
                        cloudExpire = 1;
                        playerPoints -= 3500;
                    }
                }
            } else if (spell.equals("Eruption")) {
                fillMatrix(eruptionArea, hitPoint);
                if (isPlayerUnderHit(eruptionArea, playerPosition)) {
                    if (!movePlayer(eruptionArea, playerPosition)) {
                        playerPoints -= 6000;
                    }
                }
            }
        }

        if (spell.equals("Cloud")) spell = "Plague Cloud";

        if (heiganPoints <= 0) {
            System.out.println("Heigan: Defeated!");
        } else {
            System.out.printf("Heigan: %.2f%n", heiganPoints);
        }
        if (playerPoints <= 0) {
            System.out.printf("Player: Killed by %s%n", spell);
        } else {
            System.out.printf("Player: %d%n", playerPoints);
        }
        System.out.printf("Final position: %d, %d%n", playerPosition[0], playerPosition[1]);
    }

    private static boolean movePlayer(int[][] coordinates, int[] position) {
        int[] newPosition = new int[2];
        newPosition[0] = position[0] - 1;
        newPosition[1] = position[1];
        if (!isPlayerUnderHit(coordinates, newPosition) && newPosition[0] >= 0) {
            position[0] = newPosition[0];
            position[1] = newPosition[1];
            return true;
        }
        newPosition[0] = position[0];
        newPosition[1] = position[1] + 1;
        if (!isPlayerUnderHit(coordinates, newPosition) && newPosition[1] < 15) {
            position[0] = newPosition[0];
            position[1] = newPosition[1];
            return true;
        }
        newPosition[0] = position[0] + 1;
        newPosition[1] = position[1];
        if (!isPlayerUnderHit(coordinates, newPosition) && newPosition[0] < 15) {
            position[0] = newPosition[0];
            position[1] = newPosition[1];
            return true;
        }
        newPosition[0] = position[0];
        newPosition[1] = position[1] - 1;
        if (!isPlayerUnderHit(coordinates, newPosition) && newPosition[1] >= 0) {
            position[0] = newPosition[0];
            position[1] = newPosition[1];
            return true;
        }
        return false;
    }

    private static boolean isPlayerUnderHit(int[][] coordinates, int[] position) {
        for (int[] coordinate : coordinates) {
            if (coordinate[0] == position[0] && coordinate[1] == position[1]) return true;
        }
        return false;
    }

    private static void fillMatrix(int[][] matrix, int[] value) {

        int count = 0;
        for (int i = value[0] - 1; i <= value[0] + 1; i++) {
            for (int j = value[1] - 1; j <= value[1] + 1; j++) {
                matrix[count][0] = i;
                matrix[count][1] = j;
                count++;
            }
        }
    }
}
