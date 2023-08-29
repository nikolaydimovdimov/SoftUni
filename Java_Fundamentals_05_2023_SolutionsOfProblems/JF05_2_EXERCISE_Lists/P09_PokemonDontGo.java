package JF05_2_EXERCISE_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09_PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> distanceList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sumOfDistance = 0;
        while (!distanceList.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());
            int distValue = 0;
            if (index < 0) {
                distValue = distanceList.get(0);
                distanceList.set(0, distanceList.get(distanceList.size() - 1));
            } else if (index > distanceList.size() - 1) {
                distValue = distanceList.get(distanceList.size() - 1);
                distanceList.set(distanceList.size() - 1, distanceList.get(0));
            } else {
                distValue = distanceList.get(index);
                distanceList.remove(index);
            }
            recalculateList(distanceList, distValue);
            sumOfDistance += distValue;
        }
        System.out.println(sumOfDistance);
    }

    public static void recalculateList(List<Integer> numList, int value) {
        for (int i = 0; i < numList.size(); i++) {
            int oldValue = numList.get(i);
            if (oldValue <= value) {
                oldValue += value;
            } else {
                oldValue -= value;
            }
            numList.set(i, oldValue);
        }
    }
}
