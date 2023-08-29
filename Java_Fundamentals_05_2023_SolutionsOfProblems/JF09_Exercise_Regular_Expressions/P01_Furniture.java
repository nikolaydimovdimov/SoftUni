package JF09_Exercise_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01_Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rgx = ">>(?<type>[A-Za-z]+)<<(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(rgx);
        double totalAmount = 0;

        String inputLine = scanner.nextLine();
        System.out.println("Bought furniture:");
        while (!inputLine.equals("Purchase")) {
            Matcher matcher = pattern.matcher(inputLine);
            if (matcher.find()) {
                System.out.println(matcher.group("type"));
                totalAmount += Double.parseDouble(matcher.group("price")) *
                        Integer.parseInt(matcher.group("quantity"));
            }
            inputLine = scanner.nextLine();
        }
        System.out.printf("Total money spend: %.2f", totalAmount);
    }
}
