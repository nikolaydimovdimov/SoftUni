package JADV5_2_Ex_Functional_Programming;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class P10_PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guestsNames = new ArrayList<>(stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList()));

        Consumer<String[]> organizeGuests = str -> {
            if (str[0].equals("Remove")) {
                if (str[1].equals("StartsWith")) {
                    guestsNames.removeIf(el -> el.startsWith(str[2]));
                } else if (str[1].equals("EndsWith")) {
                    guestsNames.removeIf(el -> el.endsWith(str[2]));
                } else {
                    guestsNames.removeIf((el -> el.length() == Integer.parseInt(str[2])));
                }
            } else if (str[0].equals("Double")) {
                List<String> namesToDouble;
                if (str[1].equals("StartsWith")) {
                    namesToDouble = guestsNames
                            .stream().filter(el -> el.startsWith(str[2]))
                            .collect(Collectors.toList());
                } else if (str[1].equals("EndsWith")) {
                    namesToDouble = guestsNames
                            .stream().filter(el -> el.endsWith(str[2]))
                            .collect(Collectors.toList());
                } else {
                    namesToDouble = guestsNames
                            .stream().filter(el -> el.length() == Integer.parseInt(str[2]))
                            .collect(Collectors.toList());
                }
                guestsNames.addAll(namesToDouble);
            }
        };


        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("Party!")) {

            organizeGuests.accept(command);

            command = scanner.nextLine().split("\\s+");
        }

        if (guestsNames.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {

            Collections.sort(guestsNames);

            System.out.println(String.join(", ", guestsNames) + " are going to the party!");
        }
    }
}


