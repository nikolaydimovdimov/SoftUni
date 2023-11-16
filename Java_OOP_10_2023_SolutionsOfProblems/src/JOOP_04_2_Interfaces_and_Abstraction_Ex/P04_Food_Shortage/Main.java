package JOOP_04_2_Interfaces_and_Abstraction_Ex.P04_Food_Shortage;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Buyer> buyersMap = new HashMap<>();
        int number = Integer.parseInt(scanner.nextLine());
        while (number-- > 0) {
            String[] token = scanner.nextLine().split("\\s+");
            if (token.length == 4) {
                buyersMap.putIfAbsent(token[0], new Citizen(token[0],
                        Integer.parseInt(token[1]),
                        token[2],
                        token[3]));
            } else {
                buyersMap.putIfAbsent(token[0], new Rebel(token[0],
                        Integer.parseInt(token[1]),
                        token[2]));
            }
        }

        String name = scanner.nextLine();
        while (!name.equals("End")) {
            if (buyersMap.containsKey(name)) buyersMap.get(name).buyFood();
            name = scanner.nextLine();
        }
        System.out.println(buyersMap
                .values()
                .stream()
                .mapToInt(Buyer::getFood)
                .sum());
    }


}
