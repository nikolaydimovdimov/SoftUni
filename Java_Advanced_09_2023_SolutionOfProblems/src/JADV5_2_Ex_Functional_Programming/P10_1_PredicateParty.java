package JADV5_2_Ex_Functional_Programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class P10_1_PredicateParty {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guestsNames = new ArrayList<>(stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList()));

        Predicate<String> myPredicate;
        Consumer<String[]> organizeGuests;


        String[] command = scanner.nextLine().split("\\s+");
        while (!command[0].equals("Party!")) {
            String finalCondition = command[2];

            if (command[1].equals("StartsWith")) {
                myPredicate = el -> el.startsWith(finalCondition);
            } else if (command[1].equals("EndsWith")) {
                myPredicate = el -> el.endsWith(finalCondition);
            } else {
                myPredicate = el -> el.length() == Integer.parseInt(finalCondition);
            }

            Predicate<String> finalMyPredicate = myPredicate;

            organizeGuests = str -> {
                if (str[0].equals("Remove")) {
                    guestsNames.removeIf(finalMyPredicate);
                } else if (str[0].equals("Double")) {
                    List<String> namesToDouble;
                    namesToDouble = guestsNames
                            .stream().filter(finalMyPredicate)
                            .collect(Collectors.toList());

                    guestsNames.addAll(namesToDouble);
                }
            };

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




