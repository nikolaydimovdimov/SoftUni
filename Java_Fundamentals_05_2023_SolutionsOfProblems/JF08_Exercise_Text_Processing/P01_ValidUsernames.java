package JF08_Exercise_Text_Processing;

import java.util.Scanner;

public class P01_ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] usernamesArr = scanner.nextLine().split(", ");
        for (String un : usernamesArr) {

            if (un.length() < 3 || un.length() > 16)  continue;

            char[] unCh = un.toCharArray();
            boolean isCorrect = true;
            for (char ch : unCh) {
                if (!Character.isLetterOrDigit(ch) && ch != '-' && ch != '_') {
                    isCorrect = false;
                    break;
                }
            }
            if (isCorrect) System.out.println(un);
        }
    }
}
