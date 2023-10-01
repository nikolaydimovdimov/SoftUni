package JADV3_2_Ex_Sets_and_Maps_Advanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Set<String> usernamesSet = new LinkedHashSet<>();
        for (int i = 0; i < number; i++) {
            String username = scanner.nextLine();
            usernamesSet.add(username);
        }
        System.out.println(String.join(System.lineSeparator(), usernamesSet));
    }
}
