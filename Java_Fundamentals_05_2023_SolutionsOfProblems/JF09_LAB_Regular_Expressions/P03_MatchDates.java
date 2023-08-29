package JF09_LAB_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03_MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String rgx = "\\b(?<day>[0-9]{2})([\\/.-])(?<month>[A-Z][a-z]{2})\\2(?<year>[0-9]{4})\\b";
        Pattern pattern = Pattern.compile(rgx);
        Matcher matcher = pattern.matcher(inputLine);
        while (matcher.find()) {
            System.out.printf("Day: %s, Month: %s, Year: %s%n", matcher.group("day"),
                    matcher.group("month"), matcher.group("year"));
        }
    }
}
