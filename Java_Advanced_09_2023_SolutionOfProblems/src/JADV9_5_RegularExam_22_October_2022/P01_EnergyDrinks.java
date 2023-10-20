package JADV9_5_RegularExam_22_October_2022;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class P01_EnergyDrinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> drinksQueue = new ArrayDeque<>();
        Deque<Integer> caffeineStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(caffeineStack::push);

        Arrays.stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(drinksQueue::offer);

        int totalCaffeine = 0;

        while (!(caffeineStack.isEmpty() || drinksQueue.isEmpty())) {
            int drink = drinksQueue.poll();
            int caffeine = caffeineStack.pop();

            int currentCaffeine = drink * caffeine;

            if (totalCaffeine + currentCaffeine > 300) {
                drinksQueue.offer(drink);
                totalCaffeine -= 30;
                if (totalCaffeine < 0) totalCaffeine = 0;
            } else {
                totalCaffeine += currentCaffeine;
            }
        }

        if (drinksQueue.isEmpty()) {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        } else {
            System.out.println("Drinks left: "
                    + drinksQueue.toString().replaceAll("[\\[\\]]", ""));
        }
        System.out.printf("Stamat is going to sleep with %d mg caffeine.%n", totalCaffeine);
    }
}
