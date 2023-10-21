package JADV10_1_Regular_Exam_21_10_2023;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class P01_OffroadChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> fuelStack = new ArrayDeque<>();
        Deque<Integer> consumptionIndexQueue = new ArrayDeque<>();
        Deque<Integer> neededFuelQueue = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s"))
                .mapToInt(Integer::parseInt)
                .forEach(fuelStack::push);

        Arrays.stream(scanner.nextLine().split("\\s"))
                .mapToInt(Integer::parseInt)
                .forEach(consumptionIndexQueue::offer);

        Arrays.stream(scanner.nextLine().split("\\s"))
                .mapToInt(Integer::parseInt)
                .forEach(neededFuelQueue::offer);

        int altitudeCount = 0;
        while (!fuelStack.isEmpty()) {
            int fuel = fuelStack.pop();
            int consumptionIndex = consumptionIndexQueue.poll();
            int neededFuel = neededFuelQueue.poll();
            if (fuel - consumptionIndex < neededFuel) {
                System.out.printf("John did not reach: Altitude %d%n", altitudeCount + 1);
                break;
            }
            altitudeCount++;
            System.out.printf("John has reached: Altitude %d%n", altitudeCount);
        }

        if (altitudeCount > 0 && altitudeCount < 4) {
            System.out.print("John failed to reach the top.\n" +
                    "Reached altitudes: Altitude 1");
            for (int i = 2; i <= altitudeCount; i++) {
                System.out.printf(", Altitude %d", i);
            }
        } else if (altitudeCount == 0) {
            System.out.println("John failed to reach the top.");
            System.out.print("John didn't reach any altitude.");
        } else if (altitudeCount == 4) {
            System.out.print("John has reached all the altitudes and managed to reach the top!");
        }
    }
}

