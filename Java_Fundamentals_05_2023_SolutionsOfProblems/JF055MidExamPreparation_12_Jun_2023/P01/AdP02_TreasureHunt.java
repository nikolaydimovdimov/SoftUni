package JF055MidExamPreparation_12_Jun_2023.P01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AdP02_TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> treasureChest = Arrays
                .stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")) {
            String[] commandEl = command.split(" ");

            if (commandEl[0].equals("Loot")) {

                for (int i = 1; i < commandEl.length; i++) {

                    if (treasureChest.contains(commandEl[i])) continue;
                    treasureChest.add(0, commandEl[i]);
                }

            } else if (commandEl[0].equals("Drop")) {
                int index = Integer.parseInt(commandEl[1]);

                if (index < 0 || index > treasureChest.size() - 1) {
                    command = scanner.nextLine();
                    continue;
                }

                treasureChest.add(treasureChest.get(index));
                treasureChest.remove(index);

            } else if (commandEl[0].equals("Steal")) {
                int count = Integer.parseInt(commandEl[1]);

                if (count > treasureChest.size()) count = treasureChest.size();
                List<String> stealItems = new ArrayList<>();

                for (int i = count; i > 0; i--) {
                    stealItems.add(treasureChest.get(treasureChest.size() - i));
                    treasureChest.remove(treasureChest.size() - i);
                }

                System.out.println(String.join(", ", stealItems));
            }

            command = scanner.nextLine();
        }

        if (treasureChest.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            double avrGain = 0;

            for (String s : treasureChest) {
                avrGain += s.length();
            }
            avrGain = avrGain * 1.0 / treasureChest.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.", avrGain);
        }


    }
}
