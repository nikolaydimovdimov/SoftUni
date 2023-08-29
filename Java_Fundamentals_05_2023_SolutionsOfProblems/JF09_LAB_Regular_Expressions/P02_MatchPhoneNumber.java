package JF09_LAB_Regular_Expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputNumbers = scanner.nextLine();
        String rgx = "\\+359([ -])[2]\\1(\\d){3}\\1(\\d){4}\\b";
        Pattern pattern = Pattern.compile(rgx);
        Matcher matcher = pattern.matcher(inputNumbers);
        List<String> outputNumbers = new ArrayList<>();
        while (matcher.find()) {
            outputNumbers.add(matcher.group());
        }
        System.out.println(String.join(", ", outputNumbers));

    }
}
