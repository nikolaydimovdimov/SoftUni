package JADV3_1_LAB_Sets_and_Maps_Advanced;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P02_SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> setGuests = new TreeSet<>();
        String input = scanner.nextLine();
        while (!input.equals("PARTY")) {
            setGuests.add(input);
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("END")) {
            setGuests.remove(input);
            input = scanner.nextLine();
        }
        System.out.println(setGuests.size());
        setGuests.forEach(e -> System.out.println(e));
    }
}
