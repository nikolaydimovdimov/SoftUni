package JADV3_2_Ex_Sets_and_Maps_Advanced;

import java.util.*;

public class P07_HandsOfCards {
    private static Map<String, Integer> typeOfCardValue = new HashMap<>();
    private static Map<String, Integer> colorOfCardsValue = Map.of("S", 4,
            "H", 3,
            "D", 2,
            "C", 1);
    private static Map<String, Set<String>> playersCardsMap = new LinkedHashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 2; i < 11; i++) {
            typeOfCardValue.put(String.valueOf(i), i);
        }
        typeOfCardValue.put("J", 11);
        typeOfCardValue.put("Q", 12);
        typeOfCardValue.put("K", 13);
        typeOfCardValue.put("A", 14);

        String[] input = scanner.nextLine().split("(: )|(, )");

        while (!input[0].equals("JOKER")) {

            playersCardsMap.putIfAbsent(input[0], new HashSet<>());

            for (int i = 1; i < input.length; i++) {
                playersCardsMap.get(input[0]).add(input[i]);
            }
            input = scanner.nextLine().split("(: )|(, )");
        }

        playersCardsMap.forEach((name, el) -> System.out.printf("%s: %d%n", name, cardsValue(name)));
    }

    private static int cardsValue(String name) {

        int sum = 0;

        for (String card : playersCardsMap.get(name)) {

            String type = "", color = "";

            if (card.length() == 2) {
                type = card.substring(0, 1);
                color = card.substring(1);
            } else {
                type = card.substring(0, 2);
                color = card.substring(2);
            }

            sum += typeOfCardValue.get(type) * colorOfCardsValue.get(color);
        }

        return sum;
    }
}
