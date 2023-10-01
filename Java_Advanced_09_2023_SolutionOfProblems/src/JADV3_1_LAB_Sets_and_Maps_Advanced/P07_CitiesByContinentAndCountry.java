package JADV3_1_LAB_Sets_and_Maps_Advanced;


import java.util.*;

public class P07_CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> citiesMap = new LinkedHashMap<>();
        for (int i = 0; i < number; i++) {
            String[] input = scanner.nextLine().split(" ");
            citiesMap.putIfAbsent(input[0], new LinkedHashMap<>());
            citiesMap.get(input[0]).putIfAbsent(input[1], new ArrayList<>());
            citiesMap.get(input[0]).get(input[1]).add(input[2]);
        }
        for (Map.Entry<String, Map<String, List<String>>> place : citiesMap.entrySet()) {
            System.out.printf("%s:%n", place.getKey());
            for (Map.Entry<String, List<String>> country : place.getValue().entrySet()) {
                System.out.printf(" %s -> ", country.getKey());
                System.out.println(String.join(", ", country.getValue()));
            }
        }
    }

}


