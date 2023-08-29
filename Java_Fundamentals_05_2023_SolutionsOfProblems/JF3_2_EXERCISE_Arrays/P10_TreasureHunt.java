package JF3_2_EXERCISE_Arrays;

import java.util.Scanner;

public class P10_TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String treasureChest = scanner.nextLine().replace('|', ' ');

        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")) {
            if (command.contains("Loot")) {
                String[] lootItems = command.split(" ");
                for (int i = 1; i < lootItems.length; i++) {
                    if (!treasureChest.contains(lootItems[i])) {
                        treasureChest = lootItems[i] + " " + treasureChest;
                    }
                }
            } else if (command.contains("Drop")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                String[] chest = treasureChest.split(" ");
                if (index >= 0 && index < chest.length) {
                    String item = chest[index];
                    for (int i = index; i < chest.length - 1; i++) {
                        chest[i] = chest[i + 1];
                    }
                    chest[chest.length - 1] = item;
                    treasureChest = chest[0];
                    for (int i = 1; i < chest.length; i++) {
                        treasureChest = treasureChest + " " + chest[i];
                    }
                }
            } else if (command.contains("Steal")) {
                int count = Integer.parseInt(command.split(" ")[1]);
                String[] chest = treasureChest.split(" ");
                if (count >= chest.length) {
                    treasureChest = "";
                    System.out.println(String.join(", ", chest));
                } else {
                    treasureChest = chest[0];
                    for (int i = 1; i < chest.length - count; i++) {
                        treasureChest = treasureChest + " " + chest[i];
                    }
                    for (int i = chest.length - count; i < chest.length - 1; i++) {
                        System.out.printf("%s, ", chest[i]);
                    }
                    System.out.println(chest[chest.length - 1]);
                }
            }
            command = scanner.nextLine();
        }
        int sumOfLength = 0;
        String[] chest = treasureChest.split(" ");
        for (String s : chest) {
            sumOfLength += s.length();
        }

        if (sumOfLength == 0) {
            System.out.println("Failed treasure hunt.");
        } else {
            System.out.printf("Average treasure gain: %.2f pirate credits.%n", sumOfLength * 1.0 / chest.length);
        }
    }
}
