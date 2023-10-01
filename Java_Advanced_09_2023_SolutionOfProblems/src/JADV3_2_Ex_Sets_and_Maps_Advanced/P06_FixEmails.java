package JADV3_2_Ex_Sets_and_Maps_Advanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06_FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> emailBookMap = new LinkedHashMap<>();

        while (true) {
            String name = scanner.nextLine();
            if (name.equals("stop")) break;
            String email = scanner.nextLine();
            if (email.endsWith(".us") || email.endsWith(".uk") || email.endsWith(".com")) continue;
            emailBookMap.put(name, email);
        }

        emailBookMap.forEach((n, e) -> System.out.printf("%s -> %s%n", n, e));
    }
}
