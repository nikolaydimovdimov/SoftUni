package JF055MidExamPreparation_12_Jun_2023.P01;

import java.util.Arrays;
import java.util.Scanner;

public class PE02_ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] targets = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int shotTargets = 0;

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            int targetNumber = Integer.parseInt(command);

            if (targetNumber >= 0 && targetNumber < targets.length) {
                if (targets[targetNumber] != -1) {
                    int targetValue = targets[targetNumber];
                    shotTargets++;
                    targets[targetNumber] = -1;

                    for (int i = 0; i < targets.length; i++) {
                        if (targets[i] == -1) continue;

                        if (targets[i] > targetValue) {
                            targets[i] -= targetValue;
                        } else {
                            targets[i] += targetValue;
                        }
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", shotTargets);
        System.out.println(Arrays
                .toString(targets)
                .replaceAll("[\\[\\],]", ""));
    }
}
