package JF05_2_EXERCISE_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06_CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstCards = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondCards = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        while (!firstCards.isEmpty() && !secondCards.isEmpty()) {

            if (Objects.equals(firstCards.get(0), secondCards.get(0))) {
                firstCards.remove(0);
                secondCards.remove(0);
            } else if (firstCards.get(0) > secondCards.get(0)) {
                cardExchange(firstCards, secondCards);
            } else {
                cardExchange(secondCards, firstCards);
            }
        }

        if (firstCards.isEmpty()) {
            System.out.printf("Second player wins! Sum: %d", sumCards(secondCards));
        } else {
            System.out.printf("First player wins! Sum: %d", sumCards(firstCards));
        }
    }

    public static void cardExchange(List<Integer> winnerCards, List<Integer> loserCards) {
        int saverCard = winnerCards.get(0);
        winnerCards.remove(0);
        winnerCards.add(saverCard);
        winnerCards.add(loserCards.get(0));
        loserCards.remove(0);
    }

    public static int sumCards(List<Integer> Cards) {
        int sum = 0;
        for (Integer card : Cards) {
            sum += card;
        }
        return sum;
    }
}

