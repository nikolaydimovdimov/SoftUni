package JF07_Exercise_Associative_Arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P10_SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, LinkedHashMap<String, Integer>> resultsMap = new LinkedHashMap<>();

        String totalSubmissions = "#";
        resultsMap.put(totalSubmissions, new LinkedHashMap<>());

        String[] lineText = scanner.nextLine().split("-");

        while (!lineText[0].equals("exam finished")) {
            String username = lineText[0];

            if (!lineText[1].equals("banned")) {
                String language = lineText[1];
                int points = Integer.parseInt(lineText[2]);

                resultsMap.putIfAbsent(username, new LinkedHashMap<>());
                resultsMap.get(username).putIfAbsent(language, 0);

                resultsMap.get(totalSubmissions).putIfAbsent(language, 0);
                resultsMap.get(totalSubmissions).put(language, resultsMap.get(totalSubmissions).get(language) + 1);

                if (points > resultsMap.get(username).get(language)) {
                    resultsMap.get(username).put(language, points);
                }

            } else {
                resultsMap.remove(username);
            }

            lineText = scanner.nextLine().split("-");
        }
        System.out.println("Results:");

        for (Map.Entry<String, LinkedHashMap<String, Integer>> name : resultsMap.entrySet()) {

            if (name.getKey().equals(totalSubmissions)) continue;

            System.out.printf("%s | ", name.getKey());

            int sum = 0;
            for (Map.Entry<String, Integer> lang : name.getValue().entrySet()) {
                sum += lang.getValue();
            }

            System.out.printf("%d%n", sum);
        }

        System.out.println("Submissions:");
        resultsMap.get(totalSubmissions).forEach((l, p) -> System.out.printf("%s - %d%n", l, p));
    }
}
