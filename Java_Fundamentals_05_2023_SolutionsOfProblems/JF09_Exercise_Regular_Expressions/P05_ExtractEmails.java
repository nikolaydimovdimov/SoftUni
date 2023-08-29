package JF09_Exercise_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P05_ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rgx = "(?<user>[A-Za-z0-9]([.\\-_]*[A-Za-z0-9]+)*)@(?<host>[A-Za-z]+(\\-*[A-Za-z])*([.][A-Za-z]+(\\-*[A-Za-z]+)*)*)";
        Pattern pattern = Pattern.compile(rgx);

        String text = scanner.nextLine();

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.printf("%s@%s%n", matcher.group("user"), matcher.group("host"));
        }
    }
}
