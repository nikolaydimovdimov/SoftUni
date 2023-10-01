package JADV3_2_Ex_Sets_and_Maps_Advanced;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P05_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phonebookMap = new HashMap<>();

        String[] input = scanner.nextLine().split("-");

        while (!input[0].equals("search")) {
            phonebookMap.put(input[0], input[1]);
            input = scanner.nextLine().split("-");
        }

        String line = scanner.nextLine();

        while (!line.equals("stop")) {
            if (phonebookMap.get(line) == (null)) {
                System.out.printf("Contact %s does not exist.%n", line);
            } else {
                System.out.printf("%s -> %s%n", line, phonebookMap.get(line));
            }
            line = scanner.nextLine();
        }
    }
}
