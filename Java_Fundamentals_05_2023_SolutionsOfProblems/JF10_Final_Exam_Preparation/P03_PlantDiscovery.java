package JF10_Final_Exam_Preparation;

import java.util.*;

public class P03_PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> plantsRarity = new LinkedHashMap<>();
        Map<String, List<Integer>> plantsRatings = new HashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("<->");
            plantsRarity.putIfAbsent(input[0], 0);
            plantsRarity.put(input[0], Integer.parseInt(input[1]));
            plantsRatings.putIfAbsent(input[0], new ArrayList<>());
        }

        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {
            String[] commandItems = command.split("[: \\-]+");
            if (plantsRarity.containsKey(commandItems[1])) {

                switch (commandItems[0]) {
                    case "Rate":
                        plantsRatings.putIfAbsent(commandItems[1], new ArrayList<>());
                        plantsRatings.get(commandItems[1]).add(Integer.parseInt(commandItems[2]));
                        break;
                    case "Update":
                        plantsRarity.put(commandItems[1], Integer.parseInt(commandItems[2]));
                        break;
                    case "Reset":
                        plantsRatings.get(commandItems[1]).clear();
                        break;
                    default:
                        System.out.println("error");
                        break;
                }

            } else {
                System.out.println("error");
            }
            command = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");

        for (Map.Entry<String, Integer> plant : plantsRarity.entrySet()) {

            double avg = 0;
            if (!plantsRatings.get(plant.getKey()).isEmpty()) {

                for (Integer el : plantsRatings.get(plant.getKey())) {
                    avg += el;
                }
                avg = avg / plantsRatings.get(plant.getKey()).size();
            }

            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", plant.getKey(), plant.getValue(), avg);
        }
    }
}
