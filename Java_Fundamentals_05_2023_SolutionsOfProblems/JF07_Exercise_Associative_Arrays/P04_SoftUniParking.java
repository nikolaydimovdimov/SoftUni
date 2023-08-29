package JF07_Exercise_Associative_Arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> users = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String lineText = scanner.nextLine();
            String command = lineText.split(" ")[0];
            String name = lineText.split(" ")[1];
            if (command.equals("register")) {
                String plateNumber = lineText.split(" ")[2];
                if (users.containsKey(name)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", plateNumber);
                } else {
                    users.put(name, plateNumber);
                    System.out.printf("%s registered %s successfully%n", name, plateNumber);
                }
            } else {
                if (!users.containsKey(name)) {
                    System.out.printf("ERROR: user %s not found%n", name);
                } else {
                    users.remove(name);
                    System.out.printf("%s unregistered successfully%n", name);
                }
            }
        }
//        for (Map.Entry<String, String> user : users.entrySet()) {
//            System.out.printf("%s => %s%n", user.getKey(), user.getValue());
//        }
        users.forEach((key, value) -> System.out.println(key + " => " + value));
    }
}
