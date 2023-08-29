package JF08_Exercise_Text_Processing;

import java.util.Scanner;

public class P07_StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder();
        text.append(scanner.nextLine());
        int bombsPower = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '>') {
                bombsPower += Integer.parseInt(text.charAt(i + 1) + "");
            } else if (bombsPower > 0) {
                text.deleteCharAt(i);
                bombsPower--;
                i--;
            }
        }
        System.out.println(text);
    }
}
