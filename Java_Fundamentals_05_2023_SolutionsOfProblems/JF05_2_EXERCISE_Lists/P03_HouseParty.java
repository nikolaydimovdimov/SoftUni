package JF05_2_EXERCISE_Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> guestsList = new ArrayList<>();

        int commandsNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < commandsNumber; i++) {
            String command = scanner.nextLine();
            String namePerson = command.split(" ")[0];

            if (!command.contains("not")) {

                if (guestsList.contains(namePerson)) {
                    System.out.printf("%s is already in the list!%n", namePerson);
                } else {
                    guestsList.add(namePerson);
                }

            } else {

                if (!guestsList.contains(namePerson)) {
                    System.out.printf("%s is not in the list!%n", namePerson);
                } else {
                    guestsList.remove(namePerson);
                }
            }
        }
        String delimiter=Character.toString((char)10);
        System.out.println(String.join( ((char) 10)+"",guestsList));
//        for (String gu : guestsList) {
//            System.out.println(gu);
//        }
    }
}
