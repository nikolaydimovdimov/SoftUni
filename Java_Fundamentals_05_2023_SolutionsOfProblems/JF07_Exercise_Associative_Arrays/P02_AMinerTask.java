package JF07_Exercise_Associative_Arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resourcesMap = new LinkedHashMap<>();

        String resource = scanner.nextLine();

        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            resourcesMap.putIfAbsent(resource, 0);
            resourcesMap.put(resource, resourcesMap.get(resource) + quantity);

            resource = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> item : resourcesMap.entrySet()) {
            System.out.printf("%s -> %d%n", item.getKey(), item.getValue());
        }
    }
}
