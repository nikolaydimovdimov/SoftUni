package JF09_Exercise_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rgx = "\\%(?<customer>[A-Z][a-z]+)\\%[^\\|\\$\\%\\.]*<(?<product>\\w+)>[^\\|\\$\\%\\.]*\\|(?<count>\\d+)\\|[^\\|\\$\\%\\.\\d]*(?<price>\\d+\\.?\\d*)\\$";
        Pattern pattern = Pattern.compile(rgx);
        double totalAmount = 0;

        String inputText = scanner.nextLine();

        while (!inputText.equals("end of shift")) {
            Matcher matcher = pattern.matcher(inputText);
            if (matcher.find()) {
                double costumerAmount = Integer.parseInt(matcher.group("count"))
                        * Double.parseDouble(matcher.group("price"));
                System.out.printf("%s: %s - %.2f%n", matcher.group("customer"),
                        matcher.group("product"), costumerAmount);
                totalAmount += costumerAmount;
            }
            inputText = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f%n", totalAmount);
    }
}
