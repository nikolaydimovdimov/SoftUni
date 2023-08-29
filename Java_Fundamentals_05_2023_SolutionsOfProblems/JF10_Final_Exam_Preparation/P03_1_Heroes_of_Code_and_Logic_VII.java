package JF10_Final_Exam_Preparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class P03_1_Heroes_of_Code_and_Logic_VII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, int[]> heroesMap = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] hero = scanner.nextLine().split(" ");
            heroesMap.putIfAbsent(hero[0], new int[2]);
            heroesMap.get(hero[0])[0] = Integer.parseInt(hero[1]);
            heroesMap.get(hero[0])[1] = Integer.parseInt(hero[2]);
        }
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commandItem = command.split(" - ");

            String hero = commandItem[1];
            int points = Integer.parseInt(commandItem[2]);

            switch (commandItem[0]) {
                case "CastSpell":
                    if (points > heroesMap.get(hero)[1]) {
                        System.out.printf("%s does not have enough MP to cast %s!%n", hero, commandItem[3]);
                    } else {
                        heroesMap.get(hero)[1] -= points;
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n",
                                hero, commandItem[3], heroesMap.get(hero)[1]);
                    }
                    break;
                case "TakeDamage":
                    heroesMap.get(hero)[0] -= points;
                    if (heroesMap.get(hero)[0] > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",
                                hero, points, commandItem[3], heroesMap.get(hero)[0]);
                    } else {
                        System.out.printf("%s has been killed by %s!%n", hero, commandItem[3]);
                        heroesMap.remove(hero);
                    }
                    break;
                case "Recharge":
                    heroesMap.get(hero)[1] += points;
                    if (heroesMap.get(hero)[1] > 200) {
                        points -= heroesMap.get(hero)[1] - 200;
                        heroesMap.get(hero)[1] = 200;
                    }
                    System.out.printf("%s recharged for %d MP!%n", hero, points);
                    break;
                case "Heal":
                    heroesMap.get(hero)[0] += points;
                    if (heroesMap.get(hero)[0] > 100) {
                        points -= heroesMap.get(hero)[0] - 100;
                        heroesMap.get(hero)[0] = 100;
                    }
                    System.out.printf("%s healed for %d HP!%n", hero, points);
                    break;
            }
            command = scanner.nextLine();
        }
//        for (Map.Entry<String, int[]> hero : heroesMap.entrySet()) {
//            System.out.println(hero.getKey());
//            System.out.printf(" HP: %d%n",hero.getValue()[0]);
//            System.out.printf(" MP: %d%n",hero.getValue()[1]);
//        }
        heroesMap.forEach((key, value) -> System.out.printf("%s%n HP: %d%n MP: %d%n", key, value[0], value[1]));
    }
}
