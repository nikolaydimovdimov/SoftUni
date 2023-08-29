package JF09_Exercise_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P06_ValidatePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rgxFullPass = "(?<start>_[.]+)(?<word>[A-Z][A-Za-z0-9]{4,}[A-Z])(?<end>_[.]+)";
        String rgxNumbers = "[0-9]*";

        Pattern patternFullPass = Pattern.compile(rgxFullPass);
        Pattern patternNumbers = Pattern.compile(rgxNumbers);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String password = scanner.nextLine();
            Matcher matcherFullPass = patternFullPass.matcher(password);

            if (!matcherFullPass.find()) {
                System.out.println("Invalid pass!");
                continue;
            }
            System.out.print("Group: ");
            String group = "";
            Matcher matcherNumbers = patternNumbers.matcher(matcherFullPass.group("word"));
            while (matcherNumbers.find()) {
                group += matcherNumbers.group();
            }
            if (group.length() == 0) {
                System.out.println("default");
            } else {
                System.out.println(group);
            }
        }
    }
}



