package JF10_Final_Exam_Preparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_P_rates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, int[]> cityMap = new LinkedHashMap<>();

        String[] input = scanner.nextLine().split("\\|\\|");
        while (!input[0].equals("Sail")) {
            cityMap.putIfAbsent(input[0], new int[2]);
            cityMap.get(input[0])[0] += Integer.parseInt(input[1]);
            cityMap.get(input[0])[1] += Integer.parseInt(input[2]);
            input = scanner.nextLine().split("\\|\\|");
        }

        int people, gold;
        input = scanner.nextLine().split("=>");

        while (!input[0].equals("End")) {
            switch (input[0]) {
                case "Plunder":
                    people = Integer.parseInt(input[2]);
                    gold = Integer.parseInt(input[3]);
                    cityMap.get(input[1])[0] -= people;
                    cityMap.get(input[1])[1] -= gold;
                    System.out.printf("%s plundered! %s gold stolen, %d citizens killed.%n", input[1], gold, people);
                    if (cityMap.get(input[1])[0] <= 0 || cityMap.get(input[1])[1] <= 0) {
                        cityMap.remove(input[1]);
                        System.out.printf("%s has been wiped off the map!%n", input[1]);
                    }
                    break;
                case "Prosper":
                    gold = Integer.parseInt(input[2]);
                    if (gold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        cityMap.get(input[1])[1] += gold;
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, input[1], cityMap.get(input[1])[1]);
                    }
                    break;
            }
            input = scanner.nextLine().split("=>");
        }
        if (cityMap.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", cityMap.size());
            cityMap.forEach((c, v) -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", c, v[0], v[1]));
        }
    }
}
