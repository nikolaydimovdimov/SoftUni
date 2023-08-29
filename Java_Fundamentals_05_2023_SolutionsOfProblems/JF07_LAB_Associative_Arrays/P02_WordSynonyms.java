package JF07_LAB_Associative_Arrays;

import java.util.*;

public class P02_WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> synonimsMap = new TreeMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            synonimsMap.putIfAbsent(word, new ArrayList<>());
            String synWord = scanner.nextLine();
            synonimsMap.get(word).add(synWord);
        }

        for (Map.Entry<String, List<String>> words : synonimsMap.entrySet()) {
            String key = words.getKey();
            List<String> synonimsList = words.getValue();
            System.out.printf("%s - %s%n", key, String.join(", ", synonimsList));
        }
    }
}
