package JF05_2_EXERCISE_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] specialNumbers = scanner.nextLine().split(" ");
        int bombNumber = Integer.parseInt(specialNumbers[0]);
        int power = Integer.parseInt(specialNumbers[1]);


        while (numbersList.contains(bombNumber)) {
            int bombIndex = numbersList.indexOf(bombNumber);
            int startIndex = bombIndex - power;
            if (startIndex < 0) {
                startIndex = 0;
            }
            int endIndex = bombIndex + power;
            if (endIndex > numbersList.size() - 1) {
                endIndex = numbersList.size() - 1;
            }

            for (int i = 0; i <= endIndex - startIndex; i++) {
                numbersList.remove(startIndex);
            }
        }

        int sum = 0;
        for (Integer el : numbersList) {
            sum += el;
        }

        System.out.println(sum);
    }
}
