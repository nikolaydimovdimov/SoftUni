package JF09_LAB_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01_MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        String rgx = "\\b[A-Z]{1}[a-z]+[ ][A-Z]{1}[a-z]+\\b";
        Pattern pattern = Pattern.compile(rgx);
        Matcher matcher = pattern.matcher(inputText);
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
