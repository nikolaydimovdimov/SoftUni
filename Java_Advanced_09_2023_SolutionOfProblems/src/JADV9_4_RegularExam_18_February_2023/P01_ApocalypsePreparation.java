package JADV9_4_RegularExam_18_February_2023;

import java.util.*;

public class P01_ApocalypsePreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> textilesQueue = new ArrayDeque<>();
        Deque<Integer> medicamentStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(textilesQueue::offer);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(medicamentStack::push);

        Map<Integer, String> neededResourcesMap = new HashMap<>();
        neededResourcesMap.put(30, "Patch");
        neededResourcesMap.put(40, "Bandage");
        neededResourcesMap.put(100, "MedKit");

        Map<String, Integer> healtingItemMap = new TreeMap<>();
        healtingItemMap.put("Patch", 0);
        healtingItemMap.put("Bandage", 0);
        healtingItemMap.put("MedKit", 0);

        while (!(textilesQueue.isEmpty() || medicamentStack.isEmpty())) {
            int textile = textilesQueue.poll();
            int medicament = medicamentStack.pop();
            int healingSum = textile + medicament;
            int remainingResources = 0;
            if (healingSum > 100) {
                remainingResources = healingSum - 100;
                healingSum = 100;
            }
            boolean creatingNewItem = false;
            for (Map.Entry<Integer, String> resource : neededResourcesMap.entrySet()) {
                if (resource.getKey() == healingSum) {
                    creatingNewItem = true;
                    healtingItemMap.put(resource.getValue(), healtingItemMap.get(resource.getValue()) + 1);
                    break;
                }
            }
            if (creatingNewItem) {
                if (medicamentStack.size() > 0) {
                    medicament = medicamentStack.pop() + remainingResources;
                    medicamentStack.push(medicament);
                }
            } else {
                medicament += 10;
                medicamentStack.push(medicament);
            }
        }

        if (textilesQueue.isEmpty() && medicamentStack.isEmpty()) {
            System.out.println("Textiles and medicaments are both empty.");
        } else if (textilesQueue.isEmpty()) {
            System.out.println("Textiles are empty.");
        } else {
            System.out.println("Medicaments are empty.");
        }

        while (!healtingItemMap.isEmpty()) {
            int maxNumberOfItems = -1;
            String maxItems = "";
            for (Map.Entry<String, Integer> item : healtingItemMap.entrySet()) {
                if (item.getValue() > maxNumberOfItems) {
                    maxNumberOfItems = item.getValue();
                    maxItems = item.getKey();
                }
            }
            if (maxNumberOfItems > 0) {
                System.out.printf("%s - %d%n", maxItems, maxNumberOfItems);
            }
            healtingItemMap.remove(maxItems);
        }
        if (!medicamentStack.isEmpty()) {
            System.out.println("Medicaments left: " + medicamentStack.toString().replaceAll("[\\[\\]]", ""));
        }
        if (!textilesQueue.isEmpty()) {
            System.out.println("Textiles left: " + textilesQueue.toString().replaceAll("[\\[\\]]", ""));
        }
    }
}
