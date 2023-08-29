package JF11_Final_Exam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_Followers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, int[]> folowersMap = new LinkedHashMap<>();
        String[] command = scanner.nextLine().split(":\\s+");
        String username="George";

        boolean isTrue= 100f!=100d;
        System.out.println(isTrue);

        int count;
        while (!command[0].equals("Log out")) {
            switch (command[0]) {
                case "New follower":
                    username = command[1];
                    if (!folowersMap.containsKey(username)) {
                        folowersMap.put(username, new int[2]);
                        folowersMap.get(username)[0] = 0;
                        folowersMap.get(username)[1] = 0;
                    }
                    break;
                case "Like":
                    username = command[1];
                    count = Integer.parseInt(command[2]);
                    folowersMap.putIfAbsent(username, new int[2]);
                    folowersMap.get(username)[0] += count;
                    break;
                case "Comment":
                    username = command[1];
                    folowersMap.putIfAbsent(username, new int[2]);
                    folowersMap.get(username)[1]++;
                    break;
                case "Blocked":
                    username = command[1];
                    if (folowersMap.containsKey(username)) {
                        folowersMap.remove(username);
                    } else {
                        System.out.printf("%s doesn't exist.%n", username);
                    }
                    break;
            }
            command = scanner.nextLine().split(":\\s+");
        }
        System.out.printf("%d followers%n", folowersMap.size());
        folowersMap.forEach((k, v) -> System.out.printf("%s: %d%n", k, v[0] + v[1]));

    }
}
