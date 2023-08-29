package JF02_1_LAB_Data_Types_and_Variables;

import java.util.Scanner;

public class P06_CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstCh = scanner.nextLine().charAt(0);
        char secondCh = scanner.nextLine().charAt(0);
        char thirdCh = scanner.nextLine().charAt(0);
//       String commonChars = Character.toString(firstCh) + Character.toString(secondCh) +
//                Character.toString(thirdCh);
        // (""+firstChar) - make string with char firstChar
        String commonChars=String.valueOf(firstCh)+String.valueOf(secondCh)+String.valueOf(thirdCh);
        System.out.println(commonChars);
    }
}
