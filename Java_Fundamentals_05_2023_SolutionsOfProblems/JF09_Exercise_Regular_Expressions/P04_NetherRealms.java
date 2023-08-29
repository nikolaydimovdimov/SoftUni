package JF09_Exercise_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04_NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rgxDamage = "(?<number>[+-]?\\d+[.]?\\d*)";
        String rgxCalculate = "[\\*\\/]";
        String rgxHealth = "[^0-9-+\\/*.]";

        Pattern patternDamage = Pattern.compile(rgxDamage);
        Pattern patternCalculate = Pattern.compile(rgxCalculate);
        Pattern patternHealth = Pattern.compile(rgxHealth);

        String[] demonNames = scanner.nextLine().split("\\s*,\\s*");

        for (String demonName : demonNames) {
            double damage = 0;
            int health = 0;

            Matcher matcherDamage = patternDamage.matcher(demonName);
            while (matcherDamage.find()) {
                damage += Double.parseDouble(matcherDamage.group("number"));
            }

            Matcher matcherCalculate = patternCalculate.matcher(demonName);
            while (matcherCalculate.find()) {
                if (matcherCalculate.group().equals("*")) {
                    damage *= 2.0;
                } else {
                    damage /= 2.0;
                }
            }

            Matcher matcherHealth = patternHealth.matcher(demonName);
            while (matcherHealth.find()) {
                health += (int) matcherHealth.group().charAt(0);
            }

            System.out.printf("%s - %d health, %.2f damage%n", demonName, health, damage);
        }
    }
}
