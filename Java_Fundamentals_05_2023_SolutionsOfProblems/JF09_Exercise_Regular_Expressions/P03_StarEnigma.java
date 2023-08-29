package JF09_Exercise_Regular_Expressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P03_StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rgx = "[^@\\-!:>]*@(?<planet>[A-Za-z]+)[^@\\-!:>]*:(?<population>\\d+)!(?<action>[AD])![^@\\-!:>]*\\->(?<soldierCount>\\d+)[^@\\-!:>]*";
        Pattern pattern = Pattern.compile(rgx);

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();
        int attackedPlanetsCount = 0, destroyedPlanetsCount = 0;

        String keyString = "star";

        Integer n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String message = scanner.nextLine();

            message = decryptMessage(message, getKeyNumber(message, keyString));

            Matcher matcher = pattern.matcher(message);
            if (matcher.find()) {
                if (matcher.group("action").equals("A")) {
                    attackedPlanets.add(matcher.group("planet"));
                    attackedPlanetsCount++;
                } else {
                    destroyedPlanets.add(matcher.group("planet"));
                    destroyedPlanetsCount++;
                }
            }
        }
        Collections.sort(attackedPlanets);
        Collections.sort(destroyedPlanets);
        System.out.printf("Attacked planets: %d%n", attackedPlanetsCount);
        attackedPlanets.forEach(el -> System.out.printf("-> %s%n", el));
        System.out.printf("Destroyed planets: %d%n", destroyedPlanetsCount);
        destroyedPlanets.forEach(el -> System.out.printf("-> %s%n", el));
    }

    public static String decryptMessage(String message, int keyNumber) {
        String decryptedMessage = "";
        for (int i = 0; i < message.length(); i++) {
            decryptedMessage += (char) (message.charAt(i) - keyNumber);
        }
        return decryptedMessage;
    }

    public static int getKeyNumber(String message, String keyText) {
        List<String> keyCharsList = Arrays
                .stream(message.split(""))
                .filter(el -> keyText.contains(el.toLowerCase()))
                .collect(Collectors.toList());

        return keyCharsList.size();
    }
}
