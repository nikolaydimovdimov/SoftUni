package JF07_Exercise_Associative_Arrays;

import java.util.*;

public class P01_CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lettersArr = Arrays
                .stream(scanner.nextLine().split(""))
                .filter(ch -> !ch.equals(" "))
                .toArray(String[]::new);

        Map<String, Integer> lettersMap = new LinkedHashMap<>();

        for (String ch : lettersArr) {
            lettersMap.putIfAbsent(ch, 0);
            lettersMap.put(ch, lettersMap.get(ch) + 1);
        }

        for (Map.Entry<String, Integer> letter : lettersMap.entrySet()) {
            System.out.printf("%s -> %d%n", letter.getKey(), letter.getValue());
        }
    }
}
