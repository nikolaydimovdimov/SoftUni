package JF055MidExamPreparation_12_Jun_2023.P01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialList = Arrays
                .stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Go Shopping!")) {
            String[] commandElement = command.split(" ");

            if (commandElement[0].equals("Urgent")) {

                if (!initialList.contains(commandElement[1])) {
                    initialList.add(0, commandElement[1]);
                }

            } else if (commandElement[0].equals("Unnecessary")) {

                initialList.remove(commandElement[1]);

            } else if (commandElement[0].equals("Correct")) {

                if (initialList.contains(commandElement[1])) {
                    int index = initialList.indexOf(commandElement[1]);
                    initialList.set(index, commandElement[2]);
                }

            } else if (commandElement[0].equals("Rearrange")) {

                if (initialList.contains(commandElement[1])) {
                    int index = initialList.indexOf(commandElement[1]);
                    initialList.remove(index);
                    initialList.add(commandElement[1]);
                }

            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", initialList));
    }
}

