package JF07_LAB_Associative_Arrays;

import java.util.*;

public class P03_OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split(" ");

        Map<String, Integer> wordsMap = new LinkedHashMap<>();

        for (String word : wordsArr) {
            wordsMap.putIfAbsent(word.toLowerCase(), 0);
            wordsMap.put(word.toLowerCase(), wordsMap.get(word.toLowerCase()) + 1);
        }

        List<String> oddWordsList = new ArrayList<>();
        for (Map.Entry<String, Integer> word : wordsMap.entrySet()) {
            if (word.getValue() % 2 != 0) {
                oddWordsList.add(word.getKey());
            }
        }
        System.out.println(String.join(", ", oddWordsList));
    }
}
