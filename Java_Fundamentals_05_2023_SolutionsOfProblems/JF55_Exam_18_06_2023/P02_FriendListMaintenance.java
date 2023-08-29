package JF55_Exam_18_06_2023;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_FriendListMaintenance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> friendsList = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Report")) {
            String[] commandEl = command.split(" ");

            if (commandEl[0].equals("Blacklist")) {
                String name = commandEl[1];

                if (friendsList.contains(name)) {
                    friendsList.set(friendsList.indexOf(name), "Blacklisted");
                    System.out.printf("%s was blacklisted.%n", name);
                } else {
                    System.out.printf("%s was not found.%n", name);
                }

            } else if (commandEl[0].equals("Error")) {
                int index = Integer.parseInt(commandEl[1]);

                if (isIndexValid(friendsList, index)) {
                    String name = friendsList.get(index);
                    if (!name.equals("Blacklisted") && !name.equals("Lost")) {
                        friendsList.set(index, "Lost");
                        System.out.printf("%s was lost due to an error.%n", name);
                    }
                }

            } else if (commandEl[0].equals("Change")) {
                int index = Integer.parseInt(commandEl[1]);
                String name = commandEl[2];

                if (isIndexValid(friendsList, index)) {
                    String currentName = friendsList.get(index);
                    friendsList.set(index, name);
                    System.out.printf("%s changed his username to %s.%n", currentName, name);
                }
            }

            command = scanner.nextLine();
        }

        int blackListedNames = 0;
        int lostNames = 0;

        for (String name : friendsList) {
            if (name.equals("Blacklisted")) blackListedNames++;
            if (name.equals("Lost")) lostNames++;
        }

        System.out.printf("Blacklisted names: %d%n", blackListedNames);
        System.out.printf("Lost names: %d%n", lostNames);
        System.out.println(String.join(" ", friendsList));

    }

    public static boolean isIndexValid(List<String> sentList, int index) {
        return (index >= 0 && index < sentList.size());
    }
}
