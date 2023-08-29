package P04LAB_FOR_Loop;

import java.util.Scanner;

public class P05_CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        for (int count = 0; count < text.length(); count++) {
            System.out.println(text.charAt(count));
        }
    }
}
