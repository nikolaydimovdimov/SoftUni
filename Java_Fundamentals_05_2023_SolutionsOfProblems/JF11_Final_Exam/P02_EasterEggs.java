package JF11_Final_Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String rgx = "[@#](?<color>[a-z]{3,})[@#][^A-Za-z0-9]*[\\/]+(?<amount>[0-9]+)[\\/]+";
        Pattern pattern = Pattern.compile(rgx);
        Matcher matchEggs = pattern.matcher(text);
        while (matchEggs.find()) {
            System.out.printf("You found %d %s eggs!%n",
                    Integer.parseInt(matchEggs.group("amount")), matchEggs.group("color"));
        }
    }
}
