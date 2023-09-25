package JADV3_1_LAB_Sets_and_Maps_Advanced;

import java.util.*;

public class P03_Voina_NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> setFirstPlayer = new LinkedHashSet<>();
        LinkedHashSet<Integer> setSecondPlayer = new LinkedHashSet<>();

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int number : input) {
            setFirstPlayer.add(number);
        }
        input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int number : input) {
            setSecondPlayer.add(number);
        }
        for (int i = 0; i < 50; i++) {
            int firstNumber = setFirstPlayer.iterator().next();
            setFirstPlayer.remove(firstNumber);
            int secondNumber = setSecondPlayer.iterator().next();
            setSecondPlayer.remove(secondNumber);
            if (firstNumber > secondNumber) {
                setFirstPlayer.add(firstNumber);
                setFirstPlayer.add(secondNumber);
            } else if (secondNumber > firstNumber) {
                setSecondPlayer.add(firstNumber);
                setSecondPlayer.add(secondNumber);
            }
            if (setFirstPlayer.isEmpty() || setSecondPlayer.isEmpty()) break;
        }
        if (setFirstPlayer.size() > setSecondPlayer.size()) {
            System.out.println("First player win!");
        } else if (setSecondPlayer.size() > setFirstPlayer.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
