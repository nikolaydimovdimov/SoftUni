package JF10_Final_Exam_Preparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rgx = "([*:]){2}(?<emoji>[A-Z][a-z]{2,})\\1{2}";
        Pattern pattern = Pattern.compile(rgx);
        String text = scanner.nextLine();
        int coolThreshold = 1;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                coolThreshold *= Integer.parseInt(text.charAt(i) + "");
            }
        }
        System.out.printf("Cool threshold: %d%n", coolThreshold);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        List<String> coolEmojis = new ArrayList<>();
        while (matcher.find()) {
            matches++;
            String fullEmoji = matcher.group();
            String emoji = matcher.group("emoji");
            int threshold = 0;
            for (int i = 0; i < emoji.length(); i++) {
                threshold += emoji.charAt(i);
            }
            if (threshold > coolThreshold) coolEmojis.add(fullEmoji);
        }
        System.out.printf("%d emojis found in the text. The cool ones are:%n", matches);
        System.out.println(String.join(System.lineSeparator(), coolEmojis));
    }
}
