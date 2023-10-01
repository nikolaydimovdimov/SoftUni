package JADV3_2_Ex_Sets_and_Maps_Advanced;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P04_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] inputText = scanner.nextLine().toCharArray();
        Map<Character, Integer> charMap = new TreeMap<>();
        for (char ch : inputText) {
            charMap.putIfAbsent(ch, 0);
            charMap.put(ch, charMap.get(ch) + 1);
        }
        charMap.forEach((ch, n) -> System.out.printf("%c: %d time/s%n", ch, n));
    }
}
