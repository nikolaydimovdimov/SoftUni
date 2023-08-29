package JF10_Final_Exam_Preparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01_ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rgxCommand = "(?<command>[A-Za-z]+)>>>(?<pos2>[^(>>>)]*)(>>>)?(?<pos3>\\d*)(>>>)?(?<pos4>\\d*)";
        Pattern patternCommand = Pattern.compile(rgxCommand);
        String rawKey = scanner.nextLine();
        String lineCommand = scanner.nextLine();
        while (!lineCommand.equals("Generate")) {
            int startPos = 0, endPos = 0;

            Matcher matcherCommand = patternCommand.matcher(lineCommand);
            if (!matcherCommand.find()) continue;

            switch (matcherCommand.group("command")) {
                case "Contains":
                    if (rawKey.contains(matcherCommand.group("pos2"))) {
                        System.out.printf("%s contains %s%n", rawKey, matcherCommand.group("pos2"));
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    startPos = Integer.parseInt(matcherCommand.group("pos3"));
                    endPos = Integer.parseInt(matcherCommand.group("pos4"));
                    if (matcherCommand.group("pos2").equals("Upper")) {
                        rawKey = rawKey.replace(rawKey.substring(startPos, endPos), rawKey.substring(startPos, endPos).toUpperCase());
                    } else {
                        rawKey = rawKey.replace(rawKey.substring(startPos, endPos), rawKey.substring(startPos, endPos).toLowerCase());
                    }
                    System.out.println(rawKey);
                    break;
                case "Slice":
                    startPos = Integer.parseInt(matcherCommand.group("pos2"));
                    endPos = Integer.parseInt(matcherCommand.group("pos3"));
                    rawKey = rawKey.replace(rawKey.substring(startPos, endPos), "");
                    System.out.println(rawKey);
                    break;
            }
            lineCommand = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s%n", rawKey);
    }
}
