package JF08_Exercise_Text_Processing;

import java.util.Scanner;

public class P04_CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] textCh = scanner.nextLine().toCharArray();
        for (char ch : textCh) {
            System.out.print((char) ((int) ch + 3));
        }
    }
}
