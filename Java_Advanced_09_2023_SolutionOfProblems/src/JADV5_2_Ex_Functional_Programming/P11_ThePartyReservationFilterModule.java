package JADV5_2_Ex_Functional_Programming;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P11_ThePartyReservationFilterModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guestsNamesList = new ArrayList<>();
        guestsNamesList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Set<String> commandsSet = new HashSet<>();

        String[] input = scanner.nextLine().split(";+");

        while (!input[0].equals("Print")) {
            if (input[0].equals("Add filter")) {
                commandsSet.add(input[1] + ";" + input[2]);
            } else {
                commandsSet.remove(input[1] + ";" + input[2]);
            }
            input = scanner.nextLine().split(";+");
        }

        Predicate<String> myPredicate = null;

        for (String command : commandsSet) {

            String[] com = command.split(";");

            String condition = com[1];

            if (com[0].equals("Starts with")) {
                myPredicate = el -> el.startsWith(condition);
            } else if (com[0].equals("Ends with")) {
                myPredicate = el -> el.endsWith(condition);
            } else if (com[0].equals("Length")) {
                myPredicate = el -> el.length() == Integer.parseInt(condition);
            } else if (com[0].equals("Contains")) {
                myPredicate = el -> el.contains(condition);
            }

            guestsNamesList.removeIf(myPredicate);
        }


        System.out.println(String.join(" ", guestsNamesList));
    }
}
